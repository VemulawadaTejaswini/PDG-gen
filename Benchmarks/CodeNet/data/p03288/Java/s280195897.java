import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		new Main().run();
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		int R = sc.nextInt();
		if (R < 1200) {
			System.out.println("ABC");
		} else if (R < 2800) {
			System.out.println("ARC");
		} else {
			System.out.println("AGC");
		}
	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
}