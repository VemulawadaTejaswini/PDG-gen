import java.util.*;
import java.io.*;

class Main {
	public static void main(String[] args) {
		new Main().run();
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		long T1 = sc.nextLong();
		long T2 = sc.nextLong();
		long A1 = sc.nextLong();
		long A2 = sc.nextLong();
		long B1 = sc.nextLong();
		long B2 = sc.nextLong();
		A1 -= B1;
		A2 -= B2;
		B1 = 0;
		B2 = 0;
		// 何回原点に戻ってくるか？

		if (A1 < 0) {
			A1 *= -1;
			A2 *= -1;
		}
		long d = A1 * T1 + A2 * T2;
		if (d == 0) {
			System.out.println("infinity");
			return;
		} else if (d > 0) {
			System.out.println(0);
			return;
		}
		// long long MAX=9*1e18
		d = Math.abs(d);
		A2 = Math.abs(A2);
		// 始点は 0,-d,-2d,..., -md
		//
		// A1*T1 <= m*dなるdについて2d-1が答え。
		long m = A1 * T1 / d;
		if (A1 * T1 - (m + 1) * d >= 0)
			++m;
		int bonus = 0;
		if (A1 * T1 == m * d)
			++bonus;
		System.out.println(2 * (m + 1) - 1 - bonus);
	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}

}
