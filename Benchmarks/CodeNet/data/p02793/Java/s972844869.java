import java.math.BigInteger;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A[] = new int[N];
		int M = 0;
		for(int i = 0 ; i < N ; ++i){
			A[i] = sc.nextInt();
			M = Math.max(M, A[i]);
		}
		int ps[] = new int[M + 1];
		for(int i = 0 ; i < N ; ++i){
			int a = A[i];
			for(int p = 2 ; p * p <= a ; ++p){
				int cnt = 0;
				while(a % p == 0){
					a = a / p;
					++cnt;
				}
				ps[p] = Math.max(ps[p], cnt);
			}
			if(a != 1){
				ps[a] = Math.max(ps[a], 1);				
			}
		}
		Set<Integer> primes = new HashSet<Integer>();
		for(int i = 0 ; i < ps.length ; ++i){
			if(ps[i] > 0){
				primes.add(i);				
			}
		}
		long MOD = 1000000007;
		long ret = 0;
		for(int i = 0 ; i < N ; ++i){
			int a = A[i];
			long r = 1;
			for(int p : primes){
				int cnt = ps[p];
				while(a % p == 0){
					a = a / p;
					--cnt;
				}
				for(int j = 0 ; j < cnt ; ++j){
					r = (r * p) % MOD;
				}
			}
			ret = (ret + r) % MOD;
		}
		System.out.println(ret);
	}
}
