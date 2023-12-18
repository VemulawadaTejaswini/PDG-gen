import java.util.*;
public class Main {

	public static long mod = 1_000_000_007;
	
	public static long combination(long n, long k){
		 if(k == 0)
			 return 1;
		 else if(n == k)
			 return 1;
		 else
			 return combination(n-1, k-1) * n / k % mod;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		for(int i = 1; i <= K; i++) {
			long ans = combination(N-K+1,i)*combination(K-1, i-1);
			ans %= mod;
			System.out.println(ans);	
		}

	}

}