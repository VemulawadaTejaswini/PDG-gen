import java.util.Scanner;

public class Main {
	static Long num;
	static long mod = 1000000007;
	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			Long N = Long.parseLong(sc.next());
			long A = pow(10,N);
			long a = pow(9,N);
			long b = pow(9,N);
			long c = pow(8,N);
			long d = (A-a-b+c);
			System.out.println(((d%mod)+mod)%mod);
			
		}
	}
	public static long pow(long a,Long N) {
		long res = 1;
		for(int i=0;i<N;i++) {
			res = res*a%mod;
		}
		return res;
	}
}