import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().solve();
		return;
	}

	private void solve() {
		// 入力
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();

		// 計算
		int min = Integer.MAX_VALUE;
		for (int A = 1; A < N; A++) {
			int B = N - A;
			int sumA = sumDigitsNumber(A);
			int sumB = sumDigitsNumber(B);
			if (sumA + sumB < min) {
				min = sumA + sumB;
			}
		}

		// 出力
		System.out.println(min);

		return;
	}


	private int sumDigitsNumber(int x) {
		int sum = 0;
		while(x > 0) {
			sum += x % 10;
			x /= 10;
		}
		return sum;
	}
}
