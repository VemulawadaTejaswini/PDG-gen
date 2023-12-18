import java.util.ArrayList;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		long[] A = new long[N];
		int[] num = new int[1000001];

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
		ArrayList<Pair> AL = new ArrayList<Pair>();
		for(int i = 0;i <1000001;i++ ) {
			if(num[i]!=0) {
				AL.add(new Pair(i,num[i]));
			}
		}

		for(int i = 0;i<N;i++) {
			long a = A[i];
			long ansb = 1;
			for(int j = 0;j < AL.size();j++) {
				int c = 0;
				Pair p = AL.get(j);
				while(a%p.first==0) {
					c++;
					a/=p.first;
				}
				ansb *= Math.pow(p.first, p.second-c);
				ansb %= MOD;
			}
			ans += ansb;
			ans %=MOD;
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
	public static long gcd(long a, long b) {
		while (a % b != 0) {
			long buf = a % b;
			a = b;
			b = buf;
		}
		return b;
	}

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