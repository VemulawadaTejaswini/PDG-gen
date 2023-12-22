import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	Scanner sc = new Scanner(System.in);

	void run() {
		for (;;) {
			int n = sc.nextInt();
			if (n == 0)
				break;
			int[] hs = new int[n + 1];
			for (int i = 0; i <= n; i++) {

				hs[i] = sc.nextInt();
			}
			for (int i = 0; i <= n; i++) {
				int d = 0;
				if (i < 2)
					d = hs[i + 2] - hs[i + 1];
				else {
					d = hs[i - 1] - hs[i - 2];
				}
				boolean flag = true;
				for (int j = 0; j < n; j++) {
					int dd = 0;
					if (j == i)
						if (j != 0)
							dd = hs[j + 1] - hs[j - 1];
						else
							continue;
					else if (j + 1 == i) {
						continue;
					} else
						dd = hs[j + 1] - hs[j];
					if (dd != d) {
						flag = false;
						break;
					}
				}
				if (flag) {
					System.out.println(hs[i]);
					i = n + 1;
				}
			}
		}
	}

	public static void main(String[] args) {

		new Main().run();
	}
}