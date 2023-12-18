import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		new Main().run();
	}

	final long MODULO = 1_000_000_000 + 7;

	void run() {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		for (int h = 1; h <= 3500; ++h) {
			for (int w = 1; w <= 3500; ++w) {
				if ( 4 * h * w - N * w - N * h > 0&&N * h * w % (4 * h * w - N * w - N * h) == 0 ) {
					long n = N * h * w / (4 * h * w - N * w - N * h);
					System.out.println(h + " " + w + " " + n);
					return;
				}
			}
		}
	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
}
