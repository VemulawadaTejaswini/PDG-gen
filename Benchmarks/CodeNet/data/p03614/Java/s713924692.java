import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		new Main().run();
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] p = new int[n];
		for (int i = 0; i < n; ++i) {
			p[i] = sc.nextInt();
			--p[i];
		}
		int ans = 0;
		for (int i = 0; i < n; ++i) {
			if (p[i] != i) {
				continue;
			}
			int tmp = p[i];
			p[i] = p[i + 1];
			p[i + 1] = tmp;
			++ans;
		}
		System.out.println(ans);
	}

	static void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
}
