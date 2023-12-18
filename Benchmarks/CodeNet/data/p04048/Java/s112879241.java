import java.util.*;

public class Main {
	
	public static long f(long a, long b) {
		long ans = 0;
		if(a > b) {
			long tmp = a;
			a = b;
			b = tmp;
		}
		if(a == b)return 1;
		ans = 2 * a + f(a, b - a);
		return ans;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong(), x = sc.nextLong();
		sc.close();
		long ans = n + f(n - x, x);
		System.out.println(ans);
	}

}
