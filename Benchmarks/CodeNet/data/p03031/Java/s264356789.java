import java.util.*;

public class Main {
	public static void printArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + ", ");
		}
		System.out.println();
	}

	public static int bitCount(int i) {
		i = i - ((i >>> 1) & 0x55555555);
		i = (i & 0x33333333) + ((i >>> 2) & 0x33333333);
		i = (i + (i >>> 4)) & 0x0f0f0f0f;
		i = i + (i >>> 8);
		i = i + (i >>> 16);
		return i & 0x3f;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();

		// int[][] S = new int[M][];
		int[] S = new int[M];
		for (int i = 0; i < M; i++) {
			int flag = 0;
			int k = sc.nextInt();
			for (int j = 0; j < k; j++) {
				int x = sc.nextInt();
				flag |= 1 << (x - 1);
			}
			S[i] = flag;
			// System.out.println(flag);
		}
		int[] P = new int[M];
		for (int i = 0; i < M; i++) {
			P[i] = sc.nextInt();
		}
		// printArray(P);

		// solve
		int count = 0;
		outside: for (int bits = 0; bits < 1 << N; bits++) {
			// System.out.println("--" + bits);
			for (int i = 0; i < M; i++) {
				int and = bits & S[i];
				if (bitCount(and) % 2 != P[i]) {
					continue outside;
				}
				// System.out.println("OK " + i + " - " + bitCount(and) + " = " + P[i]);
			}
			count++;
		}
		System.out.println(count);
	}
}
