import java.util.*;

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

	public static class Triple {
		public final int A, B;
		Triple(int A, int B) {
			this.A = A;
			this.B = B;
		}

		@Override
		public String toString() {
			return String.format("(%d, %d, %d)", A, B);
		}

		@Override
		public boolean equals(Object obj) {
			if (obj instanceof Triple) {
				Triple that = (Triple)obj;
				return this.A == that.A && this.B == that.B;
			}
			return false;
		}

		@Override
		public int hashCode() {
			return A ^ (-B);
		}
	}

	static final long MOD = 1000000007;

	static long search(int[] S, int[] T, int ixS, int ixT, HashMap<Triple, Long> cache) {
		long cnt = 0;
		for (int i = 0; i < ixS; i++) {
			for (int j = 0; j < ixT; j++) {
				if (S[i] == T[j]) {
					cnt += 1;
					Triple key = new Triple(i, j);
					if (cache.containsKey(key)) {
						cnt += cache.get(key);
					} else {
						long value = search(S, T, i, j, cache);
						cache.put(key, value);
						cnt += value;
					}
					cnt %= MOD;
				}
			}
		}
		return cnt;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] S = new int[N];
		int[] T = new int[M];
		for (int i = 0; i < N; i++) {
			S[i] = sc.nextInt();
		}
		for (int i = 0; i < M; i++) {
			T[i] = sc.nextInt();
		}
		HashMap<Triple, Long> cache = new HashMap<>();
		long cnt = 1;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (S[i] == T[j]) {
					cnt += 1;
					Triple key = new Triple(i, j);
					if (cache.containsKey(key)) {
						cnt += cache.get(key);
					} else {
						long value = search(S, T, i, j, cache);
						cache.put(key, value);
						cnt += value;
					}
					cnt %= MOD;
				}
			}
		}
		System.out.println(cnt);
	}
}
