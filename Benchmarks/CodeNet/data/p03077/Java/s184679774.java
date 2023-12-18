import java.util.*;

public class Main {

	static final int INF = Integer.MAX_VALUE/2;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong(), a = sc.nextLong(), b = sc.nextLong(), c = sc.nextLong(), d = sc.nextLong(), e = sc.nextLong();
		long min1 = Math.min(a, b);
		long min2 = Math.min(c, d);
		long min = Math.min(min1, min2);
		long ans = (n+min-1)/min;
		System.out.println(ans - 1 + 5);
	}
}

