import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		int n, s[], i;
		double ave, a, ans;
		Scanner sc = new Scanner(System.in);
		while (true) {
			ave = 0.0;
			a = 0.0;
			n = sc.nextInt();
			if (n == 0) {
				break;
			}
			s = new int[n];
			for (i = 0; i < n; ++i) {
				s[i] = sc.nextInt();
				ave += s[i];
			}
			ave /= (double) n;
			for (i = 0; i < n; ++i) {
				a += (s[i] - ave) * (s[i] - ave);
			}
			a /= (double) n;
			ans = Math.sqrt(a);
			System.out.println(ans);
		}
		sc.close();
	}
}

