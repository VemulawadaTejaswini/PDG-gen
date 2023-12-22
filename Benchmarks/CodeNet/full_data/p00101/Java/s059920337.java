import static java.util.Arrays.deepToString;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().run();
	}
	void tr(Object... os) {
		System.err.println(deepToString(os));
	}

	Scanner sc = new Scanner(System.in);
	public void run() {
		int t = sc.nextInt(); sc.nextLine();
		while (t-->0) {
			String line = sc.nextLine();
			System.out.println(line.replaceAll("Hoshino", "Hoshina"));
		}
	}
}