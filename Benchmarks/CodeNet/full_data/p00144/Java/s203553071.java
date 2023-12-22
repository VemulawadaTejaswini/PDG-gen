import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main{
	static Queue<Pair> queue = new LinkedList<Pair>();

	static class Pair {
		int routerIndex;
		int cost;

		Pair(int index, int cost) {
			this.routerIndex = index;
			this.cost = cost;
		}
	}

	static class Router {
		int number;
		int degree;
		Router next[];
		int cost;
		boolean mark;

		Router(int number) {
			this.number = number;
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n, m;
		Router rt[];

		n = sc.nextInt();
		rt = new Router[n + 1];
		for (int i = 0; i < n + 1; i++) {
			rt[i] = new Router(i);
		}
		for (int i = 1; i <= n; i++) {
			int number = sc.nextInt();
			int degree = sc.nextInt();
			rt[i].degree = degree;
			rt[i].next = new Router[degree];
			for (int j = 0; j < degree; j++) {
				rt[i].next[j] = rt[sc.nextInt()];
			}
		}
		m = sc.nextInt();
		for (int i = 0; i < m; i++) {
			int start = sc.nextInt();
			int goal = sc.nextInt();
			int tll = sc.nextInt();
			for (int j = 1; j <= n; j++) {
				rt[j].mark = false;
			}
			queue.clear();
			bestWay(rt, n, start, goal, 0);

			if (rt[goal].cost + 1 <= tll) {
				System.out.println(rt[goal].cost + 1);
			} else {
				System.out.println("NA");
			}
		}
	}

	public static boolean bestWay(Router rt[], int n, int start, int goal, int cost) {
		if (rt[start].mark) {
			return false;
		}
		rt[start].cost = cost;
		if (start == goal) {
			return true;
		}
		for (int i = 0; i < rt[start].degree; i++) {
			Pair p = new Pair(rt[start].next[i].number, cost + 1);
			queue.add(p);
		}
		rt[start].mark = true;
		while (!queue.isEmpty()) {
			Pair p = queue.poll();
			if (bestWay(rt, n, p.routerIndex, goal, p.cost)) {
				return true;
			}
		}
		return false;
	}
}