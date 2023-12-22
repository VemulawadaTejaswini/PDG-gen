import java.util.Scanner;

public class Main {
	void run() {
		Scanner scan = new Scanner(System.in);
		while (true) {
			int n = scan.nextInt();
			int p = scan.nextInt();
			if (n == 0 && p == 0) return;
			int[] num = new int[n];
			int pebble = p;
			for (int i = 0;; i++) {
				if (pebble != 0) {
					pebble--;
					num[i]++;
				} else {
					pebble = num[i];
					num[i] = 0;
				}
				if (num[i] == p) {
					System.out.println(i);
					break;
				}
				if (i == n - 1) i = -1;
			}
		}
	}
	public static void main(String[] args) {
		new Main().run();
	}
}