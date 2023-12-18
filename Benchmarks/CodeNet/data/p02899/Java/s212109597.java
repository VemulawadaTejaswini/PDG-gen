import java.util.*;

@SuppressWarnings("unchecked")
public class Main {
	public static class Pair implements Comparable<Pair> {
		public final int first;
		public final int second;
	
		public Pair(int first, int second) {
			this.first = first;
			this.second = second;
		}
	
		@Override
		public int compareTo(Pair o) {
			int ord = Integer.compare(this.first, o.first);
			if (ord != 0) return ord;
			ord = Integer.compare(this.second, o.second);
			return ord;
		}
	}
	
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
		Pair[] P = new Pair[N];
		for (int i = 0; i < N; i++) {
			int a = sc.nextInt();
			P[i] = new Pair(a, i + 1);
		}
		Arrays.sort(P);
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < N; i++) {
			if (i > 0) {
				sb.append(" ");
			}
			sb.append(P[i].second);
		}
		System.out.println(sb.toString());
	}
}
