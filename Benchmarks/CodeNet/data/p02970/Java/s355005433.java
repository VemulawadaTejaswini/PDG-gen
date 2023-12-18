import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		new Main().run();
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int D = sc.nextInt();
		int M = 2 * D + 1;
		System.out.println((N + M - 1) / M);
	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
}