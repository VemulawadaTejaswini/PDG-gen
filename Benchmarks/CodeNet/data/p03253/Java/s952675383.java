
import java.util.*;
public class Main {
	static long mod = (long)1e9+7; 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), M = sc.nextInt();
		sc.close();
		
		long ans = 1;
		//素因数分解して、素数ごとに組み合わせ計算に持ち込む
		for(int i=2;i*i<M;i++) {
			if(M % i==0) {
				int cnt = 0;
				while(M % i ==0) {
					cnt++; M /= i;
				}
				ans *= calcComb(N-1+cnt, N-1); ans %= mod;
			}
		}
		if(M!=1)ans *= calcComb(N-1+1, N-1);
		System.out.println(ans);
	}
	//aのp乗を求めるアルゴリズム(mod付き)
	static long modpow(long a,int p) {
		if(p==0)return 1;
		if(p%2==0) {
			int halfP = p/2;
			long root = modpow(a, halfP);
			return  root * root % mod;
		}else {
			return a*modpow(a,p-1);
		}
	}
	
	//逆元を用いた組み合わせ計算
	static long calcComb(int a, int b) {
		if(b > a-b)return calcComb(a,a-b);
		long ansMul = 1;
		long ansDiv = 1;
		for(int i=0;i<b;i++) {
			//組み合わせの分母分子をそれぞれ作っていく（毎回割るのはmod的に不可（割れるのは互いに素の時だけ））
			ansMul *= (a-i); ansMul %= mod;
			ansDiv *= (i+1); ansDiv %= mod;
		}
		//ansMul / ansDivを行いたいが、modの元で正しくするために、割り算は逆元を用いる。
		long ans = ansMul * modpow(ansDiv, (int)mod-2)%mod;
		return ans;
	}
}