import java.awt.Point;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static int n;
	static ArrayList<ArrayList<Integer>> arr;
	static int[] FDiff;
	static int[] SDiff;
	static boolean[] visited;

	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		arr = new ArrayList<>(n);
		for (int i = 0; i < n; i++) {
			arr.add(new ArrayList<Integer>());
		}

		for (int i = 0; i < n - 1; i++) {
			int from = sc.nextInt() - 1;
			int to = sc.nextInt() - 1;
			arr.get(from).add(to);
			arr.get(to).add(from);
		}

		visited = new boolean[n];
		FDiff = new int[n];
		SDiff = new int[n];
		ArrayDeque<Point> deq = new ArrayDeque<>();

		deq.add(new Point(0, 0));

		while (!deq.isEmpty()) {
			Point p = deq.poll();
			if (visited[p.x])
				continue;
			FDiff[p.x] = p.y;
			visited[p.x] = true;
			ArrayList<Integer> Edges = arr.get(p.x);
			for (int i = 0; i < Edges.size(); i++) {
				int to = Edges.get(i);
				if (!visited[to]) {
					deq.add(new Point(to, p.y + 1));
				}
			}
		}

		deq.clear();
		visited = new boolean[n];
		deq.add(new Point(n - 1, 0));
		while (!deq.isEmpty()) {
			Point p = deq.poll();
			if (visited[p.x]) {
				continue;
			}
			SDiff[p.x] = p.y;
			visited[p.x] = true;
			ArrayList<Integer> Edges = arr.get(p.x);
			for (int i = 0; i < Edges.size(); i++) {
				int to = Edges.get(i);
				if (!visited[to]) {
					deq.add(new Point(to, p.y + 1));
				}
			}
		}
		int fp = 0, sp = 0;
		for(int i = 0; i < n; i++) {
			if(FDiff[i] < SDiff[i]) {
				fp++;
			} else {
				sp++;
			}
		}
		System.out.println(fp >= sp ? "Fennec" : "Snuke");
//		System.out.println(Arrays.toString(FDiff));
//		System.out.println(Arrays.toString(SDiff));
	}
}