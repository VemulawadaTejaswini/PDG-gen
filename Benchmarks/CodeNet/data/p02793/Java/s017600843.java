import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		long[] A = new long[N];
		int NN = 1000001;
		int[] num = new int[NN];

		for(int i = 0;i < N ;i++) {
			A[i] = scn.nextLong();
		}
		long MOD = 1000000007;
		long ans = 0;
		for(int i = 0;i < N;i++) {
			int a = (int)A[i];
			for(int j = 2;j < Math.sqrt(a)+1;j++) {
				int c = 0;
				while(a%j==0) {
					c++;
					a/=j;
				}
				num[j] = Math.max(num[j], c);
			}
			if(a>1) {
				num[a] = Math.max(num[a], 1);
			}
		}
		long Aa = 1;
		for(int i = 0;i < NN;i++) {
			if(num[i]!=0) {
				Aa *= Math.pow(i, num[i])%MOD;
				Aa %= MOD;
			}
		}

		for(int i = 0;i < N;i++) {
			long buf = Aa;
			buf *= MyMath.modinv(A[i],MOD);

			ans += buf % MOD;
			ans %= MOD;
		}
		System.out.println(ans);
	}

}

class Pair implements Comparable<Pair> {
	int first, second;

	public Pair(int f, int s) {
		this.first = f;
		this.second = s;
	}

	@Override
	public int compareTo(Pair o) {// Comparatorを自由記述せよ(これはfirstが小さい順, secondが小さい順)
		if (this.first < o.first) {
			return -1;
		}
		if (this.first > o.first) {
			return 1;
		}
		if (this.second < o.second) {
			return -1;
		}
		if (this.second > o.second) {
			return 1;
		}

		return 0;
	}
}
class MyMath {

	// --0.3.2--------------------------------------------------------------//
	// -- mod逆元-----------------------------------------------------------//
	public static long modinv(long a, long mod) {// x / a (mod MOD):=  x*= modinv(a,MOD)
		long b = mod, u = 1, v = 0;
		long buf = 0;
	    while (b>0) {
	        long t = a / b;
	        a -= t * b;
	        buf = a;
	        a = b;
	        b = buf;
	        u -= t * v;
	        buf = u;
	        u = v;
	        v = buf;
	    }
	    u %= mod;
	    if (u < 0) u += mod;
	    return u;

	}

}