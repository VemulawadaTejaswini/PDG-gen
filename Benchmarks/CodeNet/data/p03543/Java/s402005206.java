import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().run();
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		for (int i = 0; i + 2 < s.length(); ++i) {
			if (s.charAt(i) == s.charAt(i + 1) && s.charAt(i + 1) == s.charAt(i + 2)) {
				System.out.println("Yes");
				return;
			}
		}
		System.out.println("No");
	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
}
