import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		boolean impo = false;
		long a[] = new long[m + 1];
		long b[] = new long[m + 2];
		a[0] = -9;
		for (int i = 1; i <= m; i++) {
			a[i] = sc.nextInt();
			b[i] = a[i] - a[i - 1] - 1;
			if (a[i] - a[i - 1] == 1) {
				impo = true;
			}
		}

		b[1] = a[1];
		b[m + 1] = n - a[m] ;
		if (impo) {
			System.out.println(0);
		} else {

			long pat = 0;
			long ans = 1;
			long nidan = 0;
			long idan = 0;

			long kni = 0;
			long kic = 0;
			for (int i = 1; i <= m + 1; i++) {
				nidan = (b[i] - 1) / 2;
				idan = (b[i] - 1) % 2;
				pat = 0;
				//System.out.println();
				for (long k = 0; k <= nidan; k++) {
					kni = nidan - k;// 二段をこれだけ
					kic = (b[i] - 1) - kni * 2;

				//	System.out.println(kni + " +" + kic);
				//System.out.println(con(kni + kic, Math.min(kni, kic)));
					pat = pat + con(kni + kic, Math.min(kni, kic)) % 1000000007;
					pat = pat % 1000000007;
				}
				// System.out.println(b[i]);
				//System.out.println("!" + pat);
				//System.out.println((ans * pat) % 1000000007);
				ans = (ans * pat) % 1000000007;
			}

			System.out.println(ans);
		}

	}

	static public long con(long n, long r) {
		long num = 1;
		for (long i = 1; i <= r; i++) {
			num = num * (n - i + 1) / i;
		}
		return num;
	}
}