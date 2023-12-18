import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int w[] = new int[n];
			int s1 = 0;
			int s2 = 0;
			for (int i = 0; i < n; i++) {
				w[i] = sc.nextInt();
				s2 += w[i];
			}

			int ans = s2;
			int dif = 0;
			for (int i = 0; i < n; i++) {
				s1 += w[i];
				s2 -= w[i];
				dif = Math.abs(s1 - s2);
				if (dif < ans) {
					ans = dif;
				}
			}
			
			System.out.println(ans);
		}
	}
}
