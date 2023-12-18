import java.util.*;
 
public class Main {
	static Scanner scanner = new Scanner(System.in);
 
	public static void main(String[]$) {
		long k = scanner.nextLong();
		long ans = 0;
		long add = 1;
		for (int i = 0; i < k; i++) {
			long next = ans + add * 10;
			ans += add;
			if (ans * sum(next) > next * sum(ans)) {
				ans = next;
				add *= 10;
			}
			System.out.println(ans);
		}
	}

	static int sum(long n) {
		int sum = 0;
		while (n != 0) {
			sum += n % 10;
			n /= 10;
		}
		return sum;
	}
}