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
		int A = sc.nextInt();
		int B = sc.nextInt();
		System.out.println(Math.max(0, A - 2 * B));
	}

	static void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
}