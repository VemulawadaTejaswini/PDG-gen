
public class Main {
	public static void main(String args[]) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int N = sc.nextInt();

		int[] A = new int[N];

		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}

		int result = gcd(A);

		for (int i = 0; i < N; i++) {
			if (A[i] % (result * 2) != 0) {
				if (i < N-1) {
					A[i] = A[i+1];
				} else {
					A[i] = A[i-1];
				}
			}
		}

		result = gcd(A);

		System.out.println(result);
	}

	static int gcd(final int... param) {
		final int len = param.length;
		int g = gcd(param[0], param[1]); //gcd(a, b) は以前作ったもの
		for (int i = 1; i < len - 1; i++) {
			g = gcd(g, param[i + 1]); //gcd(a, b) は以前作ったもの
		}
		return g;
	}

	static int gcd(int p1, int p2) {
		int a = p1, b = p2, r;

		//ユークリッドの互除法により最大公約数を求める
		while ((r = a % b) != 0) {
			a = b;
			b = r;
		}
		return b;
	}
}