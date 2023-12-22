
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
		for (;sc.hasNext();) {
			int w = sc.nextInt();
			if (w < 0) break;
			int yen = 1150;
			if (w > 30) { yen += (w - 30) * 160; w = 30; }
			if (w > 20) { yen += (w - 20) * 140; w = 20; }
			if (w > 10) { yen += (w - 10) * 125; w = 10; }
			System.out.println(4280 - yen);
		}
	}
}