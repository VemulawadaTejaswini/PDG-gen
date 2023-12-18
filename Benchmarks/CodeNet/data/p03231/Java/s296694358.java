import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();
		char[] S = sc.next().toCharArray();
		char[] T = sc.next().toCharArray();
		int g = (int)gcd(N,M);
		long L = N * M / g;

		for(int i = 0;i<g;i++) {
			if(S[N/g * i] != T[M/g *i]) {
				System.out.println("-1");
				return;
			}
		}

		System.out.println(L);
	    sc.close();
	}



    private static long lcm(long m, long n) {
        return m * n / gcd(m, n);
    }

    private static long gcd(long m, long n) {
        if(m < n) return gcd(n, m);
        if(n == 0) return m;
        return gcd(n, m % n);
    }


}
