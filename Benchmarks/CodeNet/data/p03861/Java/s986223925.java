import java.io.*;
import java.util.*;

class Main {

	public static void main(String[] args) throws Exception {
		final Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long x = sc.nextLong();

		long c = a % x;
		if (c > (b - a)) {
			if (a <= x && x <= b) {
				System.out.println(1);
				return;
			}

			System.out.println(0);
			return;
		}
		System.out.println((b - a - c) / x + 1);
	}
}
