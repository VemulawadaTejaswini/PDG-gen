import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
*/public class Main {
	public static void main(String[] args) {
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		Scanner in = new Scanner(inputStream);
		PrintWriter out = new PrintWriter(outputStream);
		TaskD solver = new TaskD();
		solver.solve(1, in, out);
		out.close();
	}
static class TaskD   {
public   static   final int MAX = 1_00_100;
public   static long[] fac = new long[MAX];
public   static long[] inv = new long[MAX];
public   static long[] finv = new long[MAX];

public void solve(int testNumber, Scanner in, PrintWriter out) {
        int N = in.nextInt();
        int M = in.nextInt();
        int mod = 1_000_000_007;
        setnck(mod);
        int[] fac = factor(M);
        long ans = 1;
        for(int i : fac) ans = ans*nck(i + N - 1, i, mod)%mod;
        out.println(ans);
    }

public   static void setnck(int MOD) {
        fac[0] = fac[1] = 1;
        finv[0] = finv[1] = 1;
        inv[1] = 1;
        for (int i = 2; i < MAX; i++){
            fac[i] = fac[i-1] * i % MOD;
            inv[i] = MOD - inv[MOD%i] * (MOD / i) % MOD;
            finv[i] = finv[i-1] * inv[i] % MOD;
        }
    }

static long nck(int n, int k, int MOD) {
        if (n < k) return 0;
        if (n < 0 || k < 0) return 0;
        return fac[n] * (finv[k] * finv[n - k] % MOD) % MOD;
    }

public   static int[] factor(long n) {
        int[] ret = new int[50];
        int pos = 0;
        for(int i = 2; i*i <= n; i++){
            while(n%i == 0){
                n/=i;
                ret[pos] += 1;
                if(n%i!=0) pos++;
            }
        }
        if(n!=1) ret[pos++] = 1;
        return Arrays.copyOf(ret, pos);
    }

}
}

