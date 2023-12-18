
import java.util.Scanner;

public class Main {
	public static int[] A;
	public static int[] sum1to;
	public static int[] sumtoN;
	public static int[] xor1to;
	public static int[] xortoN;
	public static int sumA;
	public static int xorA;
	public static int N;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		N = scan.nextInt();
		A = new int[N + 1];
		sum1to = new int[N + 1];
		sumtoN = new int[N + 1];
		xor1to = new int[N + 1];
		xortoN = new int[N + 1];
		for (int i = 1; i < A.length; i++) {
			A[i] = scan.nextInt();
			sumA += A[i];
			xorA ^= A[i];
			sum1to[i] = sumtoN[i] = xor1to[i] = xortoN[i] = -1;
		}
		int count = 0;
		for (int r = 1; r <= N; r++) {
			for (int l = 1; l <= r; l++) {
				// System.out.println("r:" + r + ", l:" + l);
				// System.out.println(left(r, l, A)==left0(r, l, A));
				if (left(r, l, A) == right(r, l, A)) {
					count++;
				}
			}
		}
		System.out.println(count);
	}

	public static int left(int r, int l, int[] A) {

		return xorA ^ getXor1to(l - 1) ^ getXortoN(r + 1);
	}

	public static int getXor1to(int i) {
		if (i <= 0) {
			return 0;
		}
		if (xor1to[i] == -1) {
			return xor1to[i] = getXor1to(i - 1) ^ A[i];
		} else {
			return xor1to[i];
		}
	}

	public static int getXortoN(int i) {
		if (i >= N + 1) {
			return 0;
		}
		if (xortoN[i] == -1) {
			return xortoN[i] = getXortoN(i + 1) ^ A[i];
		} else {
			return xortoN[i];
		}
	}

	public static int right(int r, int l, int[] A) {
		return sumA - getSum1to(l - 1) - getSumtoN(r + 1);
	}

	public static int getSum1to(int i) {
		if (i <= 0) {
			return 0;
		}
		if (sum1to[i] == -1) {
			return sum1to[i] = getSum1to(i - 1) + A[i];
		} else {
			return sum1to[i];
		}
	}

	public static int getSumtoN(int i) {
		if (i >= N + 1) {
			return 0;
		}
		if (sumtoN[i] == -1) {
			return sumtoN[i] = getSumtoN(i + 1) + A[i];
		} else {
			return sumtoN[i];
		}
	}
}
