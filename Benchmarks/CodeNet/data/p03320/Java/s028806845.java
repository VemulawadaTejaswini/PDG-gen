import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		sc.close();

		long ans = 0;
		long add = 1;
		long base = 10;
		for (int i = 0; i < k; i++) {
			if (ans < base - 1) {
				ans += add;
				System.out.println(ans);
			} else {
				base *= 10;
				add *= 10;
				ans += add;
				System.out.println(ans);
			}
		}
	}
}
