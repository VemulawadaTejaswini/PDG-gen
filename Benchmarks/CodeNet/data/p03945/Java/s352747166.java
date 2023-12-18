import java.util.Scanner;

public class Main {
	void run() {
		Scanner sc = new Scanner(System.in);

		char[] c = sc.next().toCharArray();
		int n = c.length;

		int min = n + 1;
		for (int i = 0; i < n; i++) {
			int cnt = 0;
			for (int j = i - 1; 0 <= j; j--) {
				if (c[j] != c[j + 1]) {
					cnt++;
				}
			}
			for (int j = i + 1; j < n; j++) {
				if (c[j - 1] != c[j]) {
					cnt++;
				}
			}
			min = Math.min(min, cnt);
		}
		System.out.println(min);
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
