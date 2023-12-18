import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] c = new int[n-1];
		int[] s = new int[n-1];
		int[] f = new int[n-1];
		for (int i = 0; i < n-1; i++) {
			c[i] = scan.nextInt();
			s[i] = scan.nextInt();
			f[i] = scan.nextInt();
		}
		int[] ans = new int[n];
		ans[n-1] = 0;
		ans[n-2] = s[n-2] + c[n-2];

		for (int i = 0; i < n-1; i++) {
			ans[i] = c[i] + s[i];
			for (int j = i+1; j < n-1; j++) {
				if (ans[i] > s[j]) {
					int M = ans[i] % f[j];
					if (M != 0) {
						ans[i] += f[i] - M;
						ans[i] += c[j];
					} else {
						ans[i] += c[j];
					}
				} else {
					ans[i] = c[j]+s[j];
				}
			}
		}


		for (int i = 0; i < n; i++) {
			System.out.println(ans[i]);
		}
	}
}
