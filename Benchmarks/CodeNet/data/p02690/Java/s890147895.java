import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long x = Long.parseLong(sc.next());
		// A^5=X+B^5
		for (int i = 0;; i++) {
			// X+B^5の部分を仮で出す
			long rs = (long) Math.pow(i, 5);
			long pow5b = rs - x; // b^5の値
			if (isInteger(pow5b)) { // pow5bが整数の5乗のとき
				long b = (long) calc5root(pow5b);
				long a = (long) calc5root(rs);
				print(a, b);
				break;
			}

			// iを負に反転させて計算
			rs = (long) Math.pow(-i, 5);
			pow5b = rs - x;
			if (isInteger(pow5b)) { // pow5bが整数の5乗のとき
				long b = (long) calc5root(pow5b);
				long a = (long) calc5root(rs);
				print(a, b);
				break;
			}
		}

	}

	private static void print(long a, long b) {
		System.out.println(a + " " + b);

	}

	private static boolean isInteger(long pow5b) {
		// 整数かどうか
		double root = calc5root(pow5b);
		return root == (long) root;
	}

	private static double calc5root(long base) {
		// 5乗根を計算
		if (base > 0) {
			return Math.pow(base, 1.0 / 5.0);
		} else {
			return -Math.pow(-base, 1.0 / 5.0);
		}

	}

}
