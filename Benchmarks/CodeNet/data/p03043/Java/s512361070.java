import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		sc.close();

		double ans = 0;
		for (int i = 1; i <= n; i++) {
			double val = 1;
			int x = i;
			while (x < k) {
				val /= 2;
				x *= 2;
			}
			ans += val;
		}
		ans /= n;
		System.out.println(ans);
	}
}
