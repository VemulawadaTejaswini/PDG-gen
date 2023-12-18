import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();

		int ans = 0;
		for (int i = 1; i <= n; i++) {
			int c = 0;
			int d = i;
			
			while (d > 0) {
				c += d % 10;
				d /= 10;
			}
			
			if (a <=  c && c <= b) {
				ans += i;
			}
		}
		System.out.println(ans);
	}
}