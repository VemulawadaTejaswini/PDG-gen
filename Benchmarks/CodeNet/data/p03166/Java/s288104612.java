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

	static int UNDEF = -1;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		ArrayList<Integer>[] edges = new ArrayList[N + 1];
		for (int i = 0; i < M; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			if (edges[x] == null) {
				edges[x] = new ArrayList<>();
			}
			edges[x].add(y);
		}
		Stack<Integer> stack = new Stack<>();
		int[] L = new int[N + 1];
		Arrays.fill(L, UNDEF);
		for (int i = 1; i <= N; i++) {
			stack.push(i);
			while (stack.size() > 0) {
				int peek = stack.peek();
				if (L[peek] != UNDEF) {
					stack.pop();
					continue;
				}
				if (edges[peek] == null) {
					L[peek] = 0;
					stack.pop();
					continue;
				}
				boolean solved = true;
				for (int child : edges[peek]) {
					if (L[child] == UNDEF) {
						stack.push(child);
						solved = false;
					}
				}
				if (solved) {
					int max = 0;
					for (int child : edges[peek]) {
						assert L[child] != UNDEF;
						max = Math.max(max, L[child]);
					}
					L[peek] = max + 1;
					stack.pop();
				}
			}
		}
		int max = 0;
		for (int i = 1; i <= N; i++) {
			max = Math.max(max, L[i]);
		}
		System.out.println(max);
	}
}
