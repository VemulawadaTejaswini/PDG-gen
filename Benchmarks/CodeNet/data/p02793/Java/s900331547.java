import java.util.Scanner;

public class Main {
	static long MOD = 1000000007;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		long sum = 1;
		long lcm = sc.nextLong();

		for(int i = 1; i < n; i++) {
			long next = sc.nextLong();
			long quo = lcm / next;

			if(lcm % next == 0) {
				sum = (sum + quo) % MOD;
				continue;
			}

			long newlcm = lcm(lcm, next);

			sum = (((sum*(newlcm / lcm)) % MOD) + newlcm/next) % MOD;
			lcm = newlcm;
		}

		System.out.println(sum);

        return;
    }

	static long gcd (long a, long b) {return b>0?gcd(b,a%b):a;}
	static long lcm (long a, long b) {return a*b/gcd(a,b);}

}

