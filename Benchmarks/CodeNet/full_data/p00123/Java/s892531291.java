import java.util.Scanner;

public class Main {
	enum Class {
		AAA(0, 35, 50, 1, 11),
		AA(0, 37, 50, 1, 17),
		A(0, 40, 0, 1, 23),
		B(0, 43, 0, 1, 29),
		C(0, 50, 0, 1, 45),
		D(0, 55, 0, 1, 56),
		E(1, 10, 0, 2, 28);
		final int _500, _1000;

		Class(int m500, int s500, int ms500, int m1000, int s1000) {
			_500 = (m500 * 60 + s500) * 100 + ms500;
			_1000 = (m1000 * 60 + s1000) * 100;
		};

		static Class of500(int val) {
			for (Class c : Class.values()) {
				if (val < c._500) { return c; }
			}
			return null;
		}

		static Class of1000(int val) {
			for (Class c : Class.values()) {
				if (val < c._1000) { return c; }
			}
			return null;
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			Class c500 = Class.of500(((int) in.nextDouble() * 100));
			Class c1000 = Class.of1000((int) (in.nextDouble() * 100));
			if (c500 == null || c1000 == null) {
				System.out.println("NA");
			} else {
				if (c500.compareTo(c1000) >= 0) System.out.println(c500);
				else System.out.println(c1000);
			}
		}
	}
}