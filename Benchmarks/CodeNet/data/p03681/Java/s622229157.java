import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long m = sc.nextLong();
		long dis = Math.abs(n - m);
		int mod = 1000000007;
		if(dis >= 2) {
			System.out.println(0);
		} else if(dis == 1) {
			long a = 1;
			long b = 1;
			for(long i = n ; i >= 1 ; i--) a = a * i % mod;
			for(long i = m ; i >= 1 ; i--) b = b * i % mod;
			System.out.println(a  % mod * b);
		} else if(dis == 0) {
			long a = 1;
			long b = 1;
			for(long i = n ; i >= 1 ; i--) a = a * i % mod;
			for(long i = m ; i >= 1 ; i--) b = b * i % mod;
			System.out.println(a * b * 2 % mod);
		}
	}
}
