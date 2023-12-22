import static java.lang.Math.*;
import static java.util.Arrays.*;
import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) {
		try {
			System.setIn(new FileInputStream("src/aoj1172/input.txt"));
			// System.setOut(new PrintStream(new FileOutputStream("src/aoj1172/result.txt")));
		} catch (FileNotFoundException e) {
		}
		new Main().run();
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		for (;;) {
			int n = sc.nextInt();
			if (n == 0) break;
			int ans = 0;
			int i = n;

			for (;;) {
				i = BigInteger.valueOf(i).nextProbablePrime().intValue();
				if (i <= 2 * n)
					ans++;
				else
					break;
			}
			System.out.println(ans);
		}
	}

	void tr(Object... os) {
		System.err.println(deepToString(os));
	}
}