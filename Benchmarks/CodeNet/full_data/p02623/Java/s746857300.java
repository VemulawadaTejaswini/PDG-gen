import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		long k = sc.nextLong();
		long[] a = new long[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextLong();
		}
		long[] b = new long[m];
		for (int i = 0; i < m; i++) {
			b[i] = sc.nextLong();
		}
		sc.close();

		int indexA = 0;
		int indexB = 0;
		long time = 0L;
		long ans = 0L;
		while (true) {
			long tmpA;
			if (indexA < n) {
				tmpA = a[indexA];
			} else {
				tmpA = 2000000000L;
			}
			long tmpB;
			if (indexB < m) {
				tmpB = b[indexB];
			} else {
				tmpB = 2000000000L;
			}

			if (tmpA >= tmpB) {
				time = time + tmpB;
				indexB++;
			} else {
				time = time + tmpA;
				indexA++;
			}

			if(time<=k) {
				ans = ans + 1L;
			}else {
				System.out.println(ans);
				return;
			}

		}
	}
}
