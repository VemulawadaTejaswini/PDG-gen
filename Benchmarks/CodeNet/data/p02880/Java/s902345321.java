import java.io.*;
import java.util.*;

public class Main {

	void run() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for (int i = 1; i <= 9; ++i) {
			for (int j = 1; j <= 9; ++j) {
				if (N == i * j) {
					System.out.println("Yes");
					return;
				}
			}
		}
		System.out.println("No");
	}

	public static void main(String[] args) throws FileNotFoundException {
		new Main().run();
	}

	static void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
}
