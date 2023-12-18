import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		boolean impo = false;
		int a[] = new int[m + 1];
		int b[] = new int[m + 2];
		a[0] = -9;
		for (int i = 1; i <= m; i++) {
			a[i] = sc.nextInt();
			b[i] = a[i] - a[i - 1] - 1;
			if (a[i] - a[i - 1] == 1) {
				impo = true;
			}
		}

		b[1] = a[1];
		b[m + 1] = n - a[m] - 1;
		if (impo) {
			System.out.println(0);
		} else {

			long pat = 0;
			long ans = 1;
			int nidan = 0;
			int idan = 0;

			int kni = 0;
			int kic = 0;
			for (int i = 1; i <= m + 1; i++) {
				nidan = (b[i] - 1) / 2;
				idan = (b[i] - 1) % 2;
				pat = 0;
				//System.out.println();
				for (int k = 0; k <= nidan; k++) {
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

	static public int con(int n, int r) {
		int num = 1;
		for (int i = 1; i <= r; i++) {
			num = num * (n - i + 1) / i;
		}
		return num;
	}
}