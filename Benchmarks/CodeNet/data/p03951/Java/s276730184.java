import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		char[] s = sc.next().toCharArray();
		char[] t = sc.next().toCharArray();
		boolean b = true;
		int ans = 2 * n;
		for (int i = 0; i < n; i++) {
			b = true;
			for (int j = 0; j + i < n; j++) {
				if (s[i + j] != t[j]) {
					b = false;
				}
			}
			if (b) {
				ans = n + i;
			}
		}

		System.out.println(ans);

	}
}
