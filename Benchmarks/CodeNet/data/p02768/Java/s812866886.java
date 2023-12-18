import java.io.*;
import java.io.ObjectInputStream.*;
import java.util.*;
import java.util.regex.*;


public class Main {

	final static long MOD = 1000000007;
	//final static long MOD = 998244353;

	public static String[] Ws = null;
	public static int wsIndx = 0;
	public static BufferedReader in = null;
	public static long cnt=0;
	public static PrintWriter pw = new PrintWriter(System.out);
	public static void main(String[] args) throws Exception {
		slove(args);
		if(in!=null){
			in.close();
		}
		pw.flush();
		pw.close();
	}

	public static void slove(String[] args) throws Exception{
		int n=nextInt();
		int a=nextInt();
		int b=nextInt();

		long ans = modPow(2,n,MOD) -1;

		long nca = nCr_withMod(n,a,MOD);
		long ncb = nCr_withMod(n,b,MOD);

		ans=(ans-nca-ncb)+2*MOD;
		ans%=MOD;

		pw.println(ans);

	}

	/* pow(a,n) % modの繰り返し2乗法による計算 */
	public static long modPow(long a ,long n,long mod) {
		if(n==0) {
			return 1;
		}
		if(n==1) {
			return a%mod;
		}
		if(n%2==1) {
			return (a * modPow(a,n-1,mod))%mod;
		}
		long t=modPow(a,n/2,mod);
		return (t*t)%mod;

	}

    static long nPr_withMod(long n, long r, long MOD) {
        long res = 1;
        for (long i = (n - r + 1); i <= n; i++) {
            res = (res * i) % MOD;
        }
        return res;
    }

    static long nCr_withMod(long n, long r, long MOD) {
        long r_factorial = nPr_withMod(r, r, MOD);
        long first = nPr_withMod(n, r, MOD);
        long second = modPow(r_factorial, MOD-2, MOD);
        return  (first * second) % MOD;
    }

	public static void check() throws Exception{
		if(in == null){
			in = new BufferedReader(new InputStreamReader(System.in));
		}
		if(Ws==null || Ws.length<=wsIndx){
			Ws = in.readLine().split(" ");
			wsIndx=0;
		}
	}
	public static int nextInt()throws Exception{
		check();
		return Integer.parseInt(Ws[wsIndx++]);
	}

	public static long nextLong()throws Exception{
		check();
		return Long.parseLong(Ws[wsIndx++]);
	}

	public static String nextString()throws Exception{
		check();
		return Ws[wsIndx++];
	}

	public static int[] nextInts()throws Exception{
		check();
		int[] tmp = new int[Ws.length];
		for(int i=0;i<tmp.length;i++){
			tmp[i]=Integer.parseInt(Ws[i]);
		}
		wsIndx=Ws.length;
		return tmp;
	}

	public static long[] nextLongs()throws Exception{
		check();
		long[] tmp = new long[Ws.length];
		for(int i=0;i<tmp.length;i++){
			tmp[i]=Long.parseLong(Ws[i]);
		}
		wsIndx=Ws.length;
		return tmp;
	}

	public static String[] nextStrings()throws Exception{
		check();
		wsIndx=Ws.length;
		return Ws;
	}


}

