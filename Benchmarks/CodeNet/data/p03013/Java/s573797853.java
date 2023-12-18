import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] a = new int[m + 2];
		int count = 1;
		a[0] = 0;
		a[m + 1] = n;

		for (int i = 1; i < m + 1; i++) {
			a[i] = sc.nextInt();
		}

		//x段間の場合の数の計算
		int[] x = new int[n];
		x[0] = 0;
		x[1] = 1;
		x[2] = 2;
		for (int i = 3; i < n; i++) {
			x[i] = x[i - 1] + x[i - 2];
		}


		for (int i = 1; i < m; i++) {
			if (a[i + 1] - a[i] == 1) {
				System.out.println("0");
				System.exit(0); //2段連続で壊れてたら0通りで終了
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
		}

		System.out.println(count % 1000000007 );

	}
}