import java.util.Scanner;

public class Main {
	void run() {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] r = new int[n];
		for (int i = 0; i < n; i++) {
			r[i] = scan.nextInt();
		}
		int maxnum = r[1] - r[0];
		for (int i = 1; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (r[j] - r[i] > maxnum) {
					maxnum = r[j] - r[i];
				}
			}
		}
		System.out.println(maxnum);
	}
	public static void main(String[] args) {
		new Main().run();
	}
}