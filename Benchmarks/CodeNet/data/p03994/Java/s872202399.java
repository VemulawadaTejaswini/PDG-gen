import java.util.Scanner;

public class Main {
	void run() {
		Scanner sc = new Scanner(System.in);

		char[] c = sc.next().toCharArray();
		int n = c.length;
		int k = sc.nextInt();

		for (int i = 0; i < n; i++) {
			int t = ('z' + 1 - c[i]);
			if (t <= k) {
				k -= t;
				c[i] = 'a';
			}
		}
		k %= 26;
		c[c.length - 1] += k;
		if ('z' < c[c.length - 1]) {
			c[c.length - 1] -= 26;
		}
		System.out.println(c);
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
