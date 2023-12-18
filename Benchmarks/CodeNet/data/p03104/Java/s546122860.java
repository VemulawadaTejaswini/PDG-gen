import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long ans = 0;
		if (a == b) {
			ans = a;
		} else if (b - a < 5) {
			ans = a;
			for (long i = a; i < b - 1; i++) {
				ans = ans ^ (a + 1);
			}
			ans = ans ^ b;
		}
		else {
			if (a % 2 == 1) {
				ans = a ^ 0;
			}
			if (b % 2 == 0) {
				ans = ans ^ b;
			}
		}
		
		System.out.println(ans);

	}

}
