import java.util.*;
 
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		long K = sc.nextLong();
		long max = Math.min((long)N,K/A);
		long MOD = 998244353;

		long[] comb = new long[N+1];
		long temp = 1;
		for(int i=1;i<=N;++i){
			temp *= N+1-i;
			temp /= i;
			comb[i] = temp;
		}
		long ans = 0;
		for(int as=0;as<=max;++as){
			long bs = (K-A*as)/B;
			if(bs<=N && (A*as + B*bs)==K){
				ans += comb[as] * comb[(int)bs];
				ans %= MOD;
			}
		}
		System.out.println(ans);
		return;
	}
}