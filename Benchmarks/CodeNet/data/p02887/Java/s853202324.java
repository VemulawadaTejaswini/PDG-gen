import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		long startTime = System.currentTimeMillis();
		new Main().run();
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int ans = 0;
		String S = sc.next();
		for (int i = 0; i < N; ++i) {
			int j = i;
			while (j + 1 < N && S.charAt(i) == S.charAt(j + 1)) {
				++j;
			}
			i = j;
			++ans;
		}
		System.out.println(ans);
	}

	static void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
}