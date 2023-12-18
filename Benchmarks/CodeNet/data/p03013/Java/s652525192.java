
import java.util.Scanner;

public class Main {

	private static long TMP = 1000000007;

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int[] a = new int[m];
			int before = -2;
			for (int i = 0; i < m; i++) {
				a[i] = sc.nextInt();
				if (a[i] - 1 == before) {
					System.out.println(0);
					return;
				}
				before = a[i];
			}

			long result = 1;
			int start = 0;
			for (int i : a) {
				int tmp = (i - 1) - start;
				long resultTmp = 0;
				for (int j = 0; j <= tmp/2; j++) {
					// jは2の数
					int tmp2 = tmp - j * 2;
					resultTmp += calc(j, tmp2);
				}
				result *= resultTmp;
				result %= TMP;
				start = i + 1;
			}
			if (0 < m) {
				int tmp = n - start;

				long resultTmp = 0;
				for (int j = 0; j <= tmp/2; j++) {
					// jは2の数
					int tmp2 = tmp - j * 2;
					resultTmp += calc(j, tmp2);
				}
				result *= resultTmp;
				result %= TMP;
			}
			System.out.println(result);

		}
	}

	static private long calc(int a, int b) {
		if (a == 0 || b == 0) {
			return 1;
		}
		long result = 1;
		if (a < b) {
			for (long i = a + b; i > b; i--) {
				result *= i;
				result %= TMP;
			}
		} else {
			for (long i = a + b; i > a; i--) {
				result *= i;
				result %= TMP;
			}
		}
		return  result;
	}

}
