import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
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
public void solve(int testNumber, Scanner in, PrintWriter out) {

        int A = in.nextInt();
        int B = in.nextInt();
        int Q = in.nextInt();
        long s[] = new long[A];
        long t[] = new long[B];
        long x[] = new long[Q];
        for (int i = 0; i < A; i++) {
            s[i] = in.nextLong();
        }
        for (int i = 0; i < B; i++) {
            t[i] = in.nextLong();
        }
        for (int i = 0; i < Q; i++) {
            x[i] = in.nextLong();
        }

        for (int i = 0; i < Q; i++) {
            long ans = 1_000_000_000_000L;
            int jm = binary_search(x[i], 0, s);
            int ju = binary_search(x[i], 1, s);
            int tm = binary_search(x[i], 0, t);
            int tu = binary_search(x[i], 1, t);

            if (jm != 1_111_111_111 && tm != 1_111_111_111) {
                ans = Math.min(ans, Math.max(s[jm]-x[i], t[tm]-x[i]));
            }
            if (ju != 1_111_111_111 && tu != 1_111_111_111) {
                ans = Math.min(ans, Math.max(x[i]-s[ju], x[i]-t[tu]));
            }
            if (jm != 1_111_111_111 && tu != 1_111_111_111) {
                ans = Math.min(ans, 2 * (s[jm] - x[i]) + (x[i] - t[tu]));
                ans = Math.min(ans, (s[jm] - x[i]) + 2 * (x[i] - t[tu]));
            }
            if (ju != 1_111_111_111 && tm != 1_111_111_111) {
                ans = Math.min(ans, 2 * (x[i]-s[ju]) + (t[tm] - x[i]));
                ans = Math.min(ans, (x[i]-s[ju]) + 2 * (t[tm] - x[i]));
            }
            out.println(ans);
        }
    }

boolean isOK(int index, long key, int ver, long[] a) {
        if (a[index] >= key && ver == 0) return true;
        if (a[index] <= key && ver == 1) return true;
        else return false;
    }

int binary_search(long key, int ver, long[] a) {
        int ng = -1;
        int ok = (int)a.length - 1;
        if(ver == 1){
            ok = 0; ng = (int)a.length;
        }
        if(!isOK(ok, key, ver, a)){
            return 1_111_111_111;
        }
        while (Math.abs(ok - ng) > 1) {
            int mid = (ok + ng) / 2;
            if (isOK(mid, key, ver, a)) ok = mid;
            else ng = mid;
        }
        return ok;
    }

}
}

