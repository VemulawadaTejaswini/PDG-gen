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
		int MAX = Math.max(N*2, 1000000);
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
		
		long ans = 1L;
		
		//二項係数演算用前処理
		long[] fac = new long[MAX+1];
		fac[0] = 1L;
		fac[1] = 1L;
		long[] inv = new long[MAX+1];
		inv[1] = 1L;
		long[] finv = new long[MAX+1];
		finv[0] = 1L;
		finv[1] = 1L;
		for(long i=2;i<MAX;i++){
			fac[(int) i] = (fac[(int) (i-1)]*i)%MOD;
			inv[(int) i] = MOD - inv[(int) (MOD%i)]*(MOD/i)%MOD;
			finv[(int) i] = (finv[(int) (i-1)] * inv[(int) i]) % MOD;
		}
		
		
		
		for(int[] prime : primes){
			//因数K個のN分割を求める
			int K = prime[1];
			ans *= fac[N+K-1] * finv[K]%MOD * finv[N-1]%MOD;
			ans %= MOD;
		}
		ans %= MOD;
		System.out.println(ans);
		
	}
}

