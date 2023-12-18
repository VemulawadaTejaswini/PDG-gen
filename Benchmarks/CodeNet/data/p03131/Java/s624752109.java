import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		long k = sc.nextInt();
		long a = sc.nextInt();
		long b = sc.nextInt();
		long count = 0;
		if (b - a > 2 && k + 1 - a >= 2) {
			k -= a - 1;
			count = k % 2;
			count += b + (b - a) * (k / 2 - 1);
		} else {
			count = 1 + k;
		}
		System.out.println(count);
	}
}
