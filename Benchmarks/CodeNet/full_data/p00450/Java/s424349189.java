import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			if (n == 0)
				break;
			int t[] = new int[n + 1];
			int re = 0;
			for (int i = 1; i <= n; i++) {
				int s = sc.nextInt();
				if (i % 2 == 0) {
					if (t[re] == s) {
						t[i] = s;
						re = i;
					} else {
						for (int j = re; j >= 1; j--) {
							if (t[j] == s)
								break;
							t[j] ^= 1;
						}
						t[++re] = s;
					}
				} else {
					t[i] = s;
					re = i;
				}
				// System.out.println(Arrays.toString(t));
			}
			int ans = 0;
			for (int i = 1; i <= re; i++) {
				if (t[i] == 0)
					ans++;
			}
			System.out.println(ans);
		}
	}
}