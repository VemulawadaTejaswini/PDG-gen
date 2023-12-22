import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int mochikabu = 0;
		int mochigane = 1000;
		int urinuke = 1;

		Scanner scan = new Scanner(System.in);
		int future = scan.nextInt();
		int kabuka[] = new int[future];

		for (int i = 0; i < future; i++) {
			kabuka[i] = scan.nextInt();
		}
		scan.close();

		//初日に買うかどうか
		if (kabuka[0] < kabuka[1]) {
			mochikabu = mochigane / kabuka[0];
			mochigane = mochigane % kabuka[0];
		}
		for (int i = 1; i < future-1; i++) {
			//折れ線グラフの山を見つけ、売る
			if (kabuka[i] >= kabuka[i - 1] && kabuka[i] > kabuka[i + 1]) {
				mochigane = mochigane + (mochikabu * kabuka[i]);
				mochikabu = 0;
				urinuke = 0;
			}
			//折れ線グラフの谷を見つけ、買う
			else if (kabuka[i] <= kabuka[i - 1] && kabuka[i] < kabuka[i + 1]) {
				mochikabu = mochigane / kabuka[i];
				mochigane = mochigane % kabuka[i];
				urinuke = 1;
			}
		}
		if (urinuke == 0) {
			System.out.println(mochigane);
		} else {
			System.out.println(mochigane + (mochikabu * kabuka[future - 1]));
		}
	}
}