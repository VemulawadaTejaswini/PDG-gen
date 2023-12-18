import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		long money = 0;

		int[][] ary = new int[2][N];

		for (int i = 0; i < N; i++) {
			ary[0][i] = sc.nextInt();
			ary[1][i] = sc.nextInt();
		}

		while (M > 0) {
			int midx = minIdx(ary);
			if (ary[1][midx] > M) {
				money += (long) ary[0][midx] * M;
				M = 0;
			} else {
				money += (long) ary[0][midx] * ary[1][midx];
				ary[0][midx] = 1000000000;
				M -= ary[1][midx];
			}
		}

		System.out.println(money);
	}

	static int minIdx(int[][] a) {
		int idx = 0;
		int min = a[0][0];
		for (int i = 0; i < a[0].length; i++) {
			if (a[0][i] < min) {
				idx = i;
				min = a[0][i];
			}
		}
		return idx;
	}
}