import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 数値
		int l = sc.nextInt();

		double ll = l;

		double a = 0.0;
		double b = 0.0;
		double c = 0.0;

		//				if (l % 3 == 2) {
		//					a = l / 3.0;
		//					b = l / 3.0 + 2.0 / 3;
		//					c = l / 3 + 1;
		//				}
		//				if (l % 3 == 1) {
		//					a = l / 3;
		//					b = l / 3;
		//					c = l / 3 + 1;
		//				}
		//				if (l % 3 == 0) {
		//					a = b = c = l / 3;
		//				}

		out(BigDecimal.valueOf(ll * ll * ll / 27.0).toPlainString());

	}

	/*
	 * 以下メソッド集
	 */

	static long gcd(long a, long b) {
		return (b == 0) ? a : gcd(b, a % b);
	}

	static int gcd(int a, int b) {
		return (b == 0) ? a : gcd(b, a % b);
	}

	static void out(String info) {
		System.out.println(info);
	}

	static void out(int info) {
		System.out.println(info);
	}

	static void out(double info) {
		System.out.println(info);
	}

	static void out(long info) {
		System.out.println(info);
	}

}
