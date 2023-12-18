import java.util.*;

@SuppressWarnings("unchecked")
public class Main {
	// public static void printArray(int[] a) {
	// 	for (int i = 0; i < a.length; i++) {
	// 		System.out.print(a[i] + ", ");
	// 	}
	// 	System.out.println();
	// }

	// public static<T> void printArrayT(T[] a) {
	// 	for (int i = 0; i < a.length; i++) {
	// 		System.out.print(a[i] + ", ");
	// 	}
	// 	System.out.println();
	// }

	public static String joinInt(int[] a, String separator) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < a.length; i++) {
			if (i > 0) {
				sb.append(separator);
			}
			sb.append(a[i]);
		}
		return sb.toString();		
	}

	static int[] nextIntArray(Scanner sc, int N) {
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		return arr;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int Q = sc.nextInt();
		ArrayList<Integer>[] edges = new ArrayList[N + 1];
		for (int i = 1; i < N; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			put(edges, a, b);
			put(edges, b, a);
		}
		int[] counter = new int[N + 1];
		for (int i = 0; i < Q; i++) {
			int p = sc.nextInt();
			int x = sc.nextInt();
			counter[p] += x;
		}
		dfs(counter, edges, 1, 0, 0);
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= N; i++) {
			if (i > 1) {
				sb.append(" ");
			}
			sb.append(counter[i]);
		}
		System.out.println(sb.toString());
	}

	static void put(ArrayList<Integer>[] edges, int a, int b) {
		if (edges[a] == null) {
			edges[a] = new ArrayList<>();
		}
		edges[a].add(b);
	}

	static void dfs(int[] counter, ArrayList<Integer>[] edges, int pos, int parent, int sum) {
		counter[pos] += sum;
		if (edges[pos] != null) {
			int sum2 = counter[pos];
			for (int child : edges[pos]) {
				if (child == parent) continue;
				dfs(counter, edges, child, pos, sum2);
			}
		}
	}
}
