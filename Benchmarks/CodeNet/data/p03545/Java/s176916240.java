import java.io.*;
import java.util.*;


public class Main {

	private static Scanner sc;
	private static Printer pr;

	private static void solve() {
		char[] abcd = sc.next().toCharArray();

		int a = abcd[0] - '0';
		int b = abcd[1] - '0';
		int c = abcd[2] - '0';
		int d = abcd[3] - '0';

		char[] op = new char[3];
		for (int i = 0; i < 0x1 << 3; i++) {
			int tmp = a;
			if ((i & 0x1 << 2) == 0) {
				tmp += b;
				op[0] = '+';
			} else {
				tmp -= b;
				op[0] = '-';
			}
			if ((i & 0x1 << 1) == 0) {
				tmp += c;
				op[1] = '+';
			} else {
				tmp -= c;
				op[1] = '-';
			}
			if ((i & 0x1) == 0) {
				tmp += d;
				op[2] = '+';
			} else {
				tmp -= d;
				op[2] = '-';
			}

			if (tmp == 7) {
				pr.printf("%c%c%c%c%c%c%c=7\n", abcd[0], op[0], abcd[1], op[1], abcd[2], op[2], abcd[3]);
				return;
			}
		}
	}

	// ---------------------------------------------------
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		pr = new Printer(System.out);

		solve();

		pr.close();
		sc.close();
	}

	private static class Printer extends PrintWriter {
		Printer(PrintStream out) {
			super(out);
		}
	}
}
