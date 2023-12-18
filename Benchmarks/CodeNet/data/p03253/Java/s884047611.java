import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
 
 
public class Main {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int Q = Integer.parseInt(sc.next());
		//long L = Long.parseLong(sc.next());
		//char[] c = sc.next().toCharArray();
		int INF = Integer.MAX_VALUE;
		Scanner sc = new Scanner(System.in);
		
		int N = Integer.parseInt(sc.next());
		int M = Integer.parseInt(sc.next());
		long MOD = 1_000_000_007;
		
		//素因数分解
		List<int[]> primes = new ArrayList<>();
		
		
		int now_prime = 2;
		int now_M = M;
		while(now_prime*now_prime<=M){
			if(now_M%now_prime == 0){
				now_M /= now_prime;
				int[] prime = new int[2];
				prime[0] = now_prime;
				prime[1] = 1;
				while(now_M%now_prime == 0){
					now_M /= now_prime;
					prime[1]++;
				}
				primes.add(prime);
				
			}
			now_prime++;
		}
		if (now_M>1){
			int[] prime = new int[2];
			prime[0] = now_M;
			prime[1] = 1;
			primes.add(prime);
		}
		
		long ans = 1;
		
		//二項係数演算用前処理
		long[] fac = new long[2*N];
		fac[0] = 1;
		fac[1] = 1;
		long[] inv = new long[2*N];
		inv[1] = 1;
		long[] finv = new long[2*N];
		finv[0] = 1;
		finv[1] = 1;
		for(int i=2;i<2*N;i++){
			fac[i] = (fac[i-1]*i)%MOD;
			inv[i] = MOD - inv[(int) (MOD%i)]*(MOD/i)%MOD;
			finv[i] = (finv[i-1] * inv[i]) % MOD;
		}
		
		
		
		for(int[] prime : primes){
			//因数K個のN分割を求める
			int K = prime[1];
			ans *= (fac[N+K-1] * (finv[K] * finv[N-1])%MOD)%MOD;
			ans %= MOD;
		}
		ans %= MOD;
		System.out.println(ans);
		
	}
}

