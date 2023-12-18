import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] a = new int[m + 2];
		long count = 1L;

		//壊れている場所がa[1]~a[m] a[0]=0(最初の段), a[m+1]=n(最後の段)
		a[0] = 0;
		a[m + 1] = n;

		for (int i = 1; i < m + 1; i++) {
			a[i] = sc.nextInt();
		}

		//x段のぼる場合の数の計算
		//数がデカそうなのでlong型
		long[] x = new long[n];
		x[0] = 1;
		x[1] = 1;
		x[2] = 2;
		for (int i = 3; i < n; i++) {
			x[i] = x[i - 1] + x[i - 2];
		}

		//2段連続で壊れてたら0通りで終了
		for (int i = 1; i < m; i++) {
			if (a[i + 1] - a[i] == 1) {
				System.out.println("0");
				System.exit(0);
			}
		}

		for (int i = 1; i <= m + 1; i++) {
			if (a[i] == 1 || a[i] == n - 1) {
				continue;
			} else if (i == 1 || i == m + 1) {
				count = count * x[a[i] - a[i - 1] - 1];
			} else {
				count = count * x[a[i] - a[i - 1] - 2];
			}
			count %= 1000000007;
		}

		System.out.println(count);

	}
}