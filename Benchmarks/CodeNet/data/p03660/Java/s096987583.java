import java.util.*;

public class Main {

	public static void main (String[] args)  {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer>[] graph = new ArrayList[n + 1];
		for (int i = 1; i <= n; i++) {
			graph[i] = new ArrayList<Integer>();
		}
		for (int i = 0; i < n - 1; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			graph[a].add(b);
			graph[b].add(a);
		}
		boolean[] arr = new boolean[n + 1];
		ArrayDeque<Integer> deqA = new ArrayDeque<>();
		ArrayDeque<Integer> deqB = new ArrayDeque<>();
		ArrayDeque<Integer> nextA = new ArrayDeque<>();
		ArrayDeque<Integer> nextB = new ArrayDeque<>();
		int countA = 0;
		int countB = 0;
		deqA.add(1);
		deqB.add(n);
		while (deqA.size() > 0 || deqB.size() > 0) {
			while (deqA.size() > 0) {
				int p = deqA.poll();
				if (arr[p]) {
					continue;
				}
				arr[p] = true;
				countA++;
				nextA.addAll(graph[p]);
			}
			while (deqB.size() > 0) {
				int p = deqB.poll();
				if (arr[p]) {
					continue;
				}
				arr[p] = true;
				countB++;
				nextB.addAll(graph[p]);
			}
			ArrayDeque<Integer> tmp = nextA;
			deqA = nextA;
			nextA = tmp;
			tmp = nextB;
			deqB = nextB;
			nextB = tmp;
		}
		if (countA > countB) {
			System.out.println("Fennec");
		} else {
			System.out.println("Snuke");
		}
	}
}
