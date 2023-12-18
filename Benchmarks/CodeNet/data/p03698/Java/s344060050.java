import java.util.Arrays;
import java.util.Scanner;

public class Main {
	void run() {
		Scanner sc = new Scanner(System.in);

		char[] c = sc.next().toCharArray();
		Arrays.sort(c);
		for (int i = 1; i < c.length; i++) {
			if (c[i] == c[i - 1]) {
				System.out.println("no");
				return;
			}
		}
		System.out.println("yes");
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
