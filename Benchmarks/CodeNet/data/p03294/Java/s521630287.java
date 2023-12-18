
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] S = new int[N + 1];

		for(int i = 1 ; i <= N ; i++){
			S[i] = sc.nextInt();
		}
		sc.close();

		S[0] = S[1];

		long ans = S[0];
		for(int i = 1 ; i <= N ; i++){
			ans = lcm(ans,S[i]);
		}

		int ans2 = 0;

		for(int i = 1 ; i <= N ; i++){
			ans2 += (ans-1)%S[i];
		}
		System.out.println(ans2);
	}

    private static long gcd(long m, long n) {
        if(m < n) return gcd(n, m);
        if(n == 0) return m;
        return gcd(n, m % n);
    }

    private static long lcm(long m, long n) {
        return m * n / gcd(m, n);
    }
}
