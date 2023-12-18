import java.util.*;

public class Main {
	
	public static long f(long a, long b) {
		long ans = 0;
		if(b == 0)return 0;
		if(a > b) {
			long tmp = a;
			a = b;
			b = tmp;
		}
		if(a == b)return a;
		ans = 2 * (b / a) * a + f(a, b % a);
		return ans;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong(), x = sc.nextLong();
		sc.close();
		long ans = 2 * (n/ x) * x + f(x, n % x);
		System.out.println(ans);
	}

}
