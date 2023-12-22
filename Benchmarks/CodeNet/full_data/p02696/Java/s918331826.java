import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
			long A = scn.nextLong();
			long B = scn.nextLong();
			long N = scn.nextLong();

			long max = 0;
			long yakusuu;
			if(A < B) {
				yakusuu = gcd(B, A);
			} else {
				yakusuu = gcd(A, B);
			}
			A = A / yakusuu;
			B = B/ yakusuu;
			for(int x = 1; x <= N; x++) {
				long ax = A * x / B;
				long ab = A * (x/B);
				long tmp = ax - ab;

				if(max < tmp) {
					max = tmp;
				}
			}
			System.out.println(max);
		}
	}

	//最大公約数gcd
	static long gcd (long a, long b) {
		long temp;
		while((temp = a%b)!=0) {
			a = b;
			b = temp;
		}
		return b;
	}
}

