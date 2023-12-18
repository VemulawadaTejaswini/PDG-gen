import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long X = sc.nextLong();

		System.out.println(calculatePatty(N, X));

	}

	public static long calculateBurgerLayerNum(int N) {
		return (long) (Math.pow(2, N + 2) - 3);
	}

	public static long calculatePattyNum(int N) {
		return (long) Math.pow(2, N + 1) - 1;
	}

	public static long calculatePatty(int N, long X) {
		if (X <= N) {
			return 0;
		}
		if (N == 0) {
			return X > 0 ? 1 : 0;
		}

		long burgerLayerNum = calculateBurgerLayerNum(N);
		long burgerLayerHalfNum = burgerLayerNum / 2;
		if (X < burgerLayerHalfNum) {
			long patty = calculatePatty(N - 1, X - 1);
			return patty;
		} else if (X == burgerLayerHalfNum) {
			long pattyNum = calculatePattyNum(N - 1);
			return pattyNum;
		} else if (X == burgerLayerHalfNum + 1) {
			long pattyNum = calculatePattyNum(N - 1);
			return pattyNum + 1;
		} else {
			long patty = calculatePatty(N - 1, X - burgerLayerHalfNum - 1);
			long pattyNum = calculatePattyNum(N - 1);
			return patty + 1 + pattyNum;
		}

	}

}