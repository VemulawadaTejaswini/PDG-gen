import java.util.*;

public class Main {

	public static long gcd(long a, long b) {
		if (a < b) {
			long tmp = a;
			a = b;
			b = tmp;
		}
		if (b == 1)
			return b;
		long r = a % b;
		if (r == 0)
			return b;
		return gcd(b, r);
	}

	public static long divide(long a, long b){
		while((a % b) == 0){
			a = a / b;
		}
		return a;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong(), b = sc.nextLong();
		sc.close();
		long ans = 1;
		long g = gcd(a, b);
		long sq = (long)Math.sqrt((double)g);
		if(g % 2 == 0){
			g = divide(g, 2);
			++ans;
		}
		for (long i = 3; i <= g; i += 2) {
			if(i > sq)break;
			if (g % i == 0) {
					++ans;
					g = divide(g, i);
			}
		}
		System.out.println(ans);
	}
}
