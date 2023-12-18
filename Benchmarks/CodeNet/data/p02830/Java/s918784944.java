import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		new Main().run();
	}

	final long m = (long) 1e9 + 7;

	void run() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		char[] s = sc.next().toCharArray();
		char[] t = sc.next().toCharArray();
		for (int i = 0; i < N; ++i) {
			System.out.print(s[i]);
			System.out.print(t[i]);
		}
		System.out.println();
	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
}