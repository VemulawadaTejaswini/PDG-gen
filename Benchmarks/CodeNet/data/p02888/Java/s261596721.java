import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] s = new int[n];
		for (int i = 0; i < n; i++) {
			s[i] = sc.nextInt();
		}
		int ans = 0;
		for (int i = 0; n - i > 2; i++) {
			for (int j = i + 1; n - j >= 2; j++) {
				for (int k = j + 1; k < n; k++) {
					if (!(s[i] < s[j] + s[k])) {
						continue;
					}
					if (!(s[j] < s[k] + s[i])) {
						continue;
					}
					if (!(s[k] < s[i] + s[j])) {
						continue;
					}
					ans++;
				}
			}
		}
		System.out.println(ans);
	}
}