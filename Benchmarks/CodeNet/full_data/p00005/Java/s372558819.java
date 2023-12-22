import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		long n, m;

		Scanner in = new Scanner(System.in);

		while (true) {
			n = in.nextInt();
			m = in.nextInt();

			System.out.println(gcd(Math.max(n, m), Math.min(n, m)) + " "
					+ (n * m) / gcd(Math.max(n, m), Math.min(n, m)));
		}
	}

	private static long gcd(long n,long m){

		if(n-m>0) return gcd(m, n-m);
		else return n;
		
	}

}