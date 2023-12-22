import java.util.Scanner;

// ALDS1_1_D
public class Main {
	void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int r, p = 0, max = 1 - 1000000000;
		for (int i = 0; i < n; i++) {
			r = sc.nextInt();
			if (i == 0) {
				p = r;
			} else {
				if (max < r - p) max = r - p;
				if (r < p) p = r;
			}
		}
		System.out.println(max);
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
