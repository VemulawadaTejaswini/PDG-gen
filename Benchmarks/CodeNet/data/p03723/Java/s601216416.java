import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().run();
	}

	final long MODULO = 1000003;

	void run() {
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
		long B = sc.nextLong();
		long C = sc.nextLong();
		long S = A + B + C;
		int cnt = 0;
		while (true) {
			if (A % 2 != 0 || B % 2 != 0 || C % 2 != 0) {
				break;
			} else {
				A = (S - A) / 2;
				B = (S - B) / 2;
				C = (S - C) / 2;
				++cnt;
			}
			if (cnt == 1_000_000) {
				break;
			}
		}
		if (cnt == 1_000_000) {
			System.out.println(-1);
		} else {
			System.out.println(cnt);
		}
	}

	private static void tr(Object... o) {
		System.out.println(Arrays.deepToString(o));
	}
}
