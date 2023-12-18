import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);
		int N = sc.nextInt();
		int[] a = nextIntArray(sc, N);
		sc.close();

		int c4 = 0, c2 = 0, other = 0;
		for (int x : a) {
			if (x % 4 == 0) {
				c4++;
			} else if (x % 2 == 0) {
				c2++;
			} else {
				other++;
			}
		}

		c2 %= 2;

		other += c2;

		if (other-1 <= c4) {
			out.println("Yes");
		} else {
			out.println("No");
		}

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}

	@SuppressWarnings("unused")
	private int[] nextIntArray(Scanner sc, int n) {
		int[] result = new int[n];
		for (int i = 0; i < n; i++) {
			result[i] = sc.nextInt();
		}
		return result;
	}
}
