import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long[] M = new long[N];

		for(int i = 0 ; i < N ; i++){
			M[i] = sc.nextLong();
		}
		sc.close();

		long ans = M[0];
		for(int i = 1 ; i < N ; i++){
			ans = gcd(ans,M[i]);
		}

		System.out.println(ans);


	}
	private static long gcd(long m, long n) {
	    if(m < n) return gcd(n, m);
	    if(n == 0) return m;
	    return gcd(n, m % n);
	}
}

