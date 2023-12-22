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
		for (; sc.hasNext();) {
			int q1 = sc.nextInt();
			if (q1 == 0)
				break;
			int b = sc.nextInt();
			int c1 = sc.nextInt();
			int c2 = sc.nextInt();
			int q2 = sc.nextInt();
			
			int BUY1U = Math.min(b / c1, q2);
			int ansBuy1 = -1;
			for (int buy1 = 1; buy1 <= BUY1U; buy1++) {
				int buy2 = (b - c1 * buy1) / c2;
				if (buy1 > 0 && buy1 + buy2 >= q1) {
					ansBuy1 = buy1;
				}
			}
			
			if (ansBuy1 == -1) System.out.println("NA");
			else {
				int buy2 = (b - c1 * ansBuy1) / c2;
				System.out.println(ansBuy1 + " " + buy2);
			}
		}
	}
}