
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().run();
	}

	int n;
	int[] color;

	private void run() {
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		int m = scanner.nextInt();
		color = new int[n];
		for(int i = 0;i<n;i++){
			color[i] = i;
		}
		for (int i = 0; i < m; i++) {
			int s = scanner.nextInt();
			int t = scanner.nextInt();
			t = root(t);
			root(s, t);
		}

		int q = scanner.nextInt();
		for (int i = 0; i < q; i++) {
			int s = scanner.nextInt();
			int t = scanner.nextInt();
			s = root(s);
			t = root(t);
			if (s == t) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
		}
	}

	private void root(int s, int t) {
		while (true) {
			if (s == t) {
				color[s] = t;
				return;
			}
			int tmp = color[s];
			color[s] = t;
			s = tmp;
		}
	}

	private int root(int t) {
		while (true) {
			if (t == color[t])
				return t;
			t = color[t];
		}
	}

}