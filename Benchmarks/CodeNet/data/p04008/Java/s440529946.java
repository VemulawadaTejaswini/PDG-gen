import java.util.Arrays;
import java.io.BufferedWriter;
import java.util.InputMismatchException;
import java.util.ArrayList;
import java.io.InputStream;
import java.util.List;
import java.util.NoSuchElementException;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.Writer;
import java.io.IOException;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 * @author ogiekako
 */
public class Main {
	public static void main(String[] args) {
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		MyScanner in = new MyScanner(inputStream);
		MyPrintWriter out = new MyPrintWriter(outputStream);
		TaskD solver = new TaskD();
		solver.solve(1, in, out);
		out.close();
	}
}

class TaskD {
    public void solve(int testNumber, MyScanner in, MyPrintWriter out) {
        int N = in.nextInt();
        int K = in.nextInt();
        int[] a = new int[N];
        for (int i = 0; i < N; i++) a[i] = in.nextInt() - 1;
        int res = a[0] == 0 ? 0 : 1;
        a[0] = 0;
        out.println(res + solve(a,K));
    }

    int[] a;
    int K;
    List<Integer>[] graph;
    int[] val;
    int res;
    private int solve(int[] a, int K) {
        this.a=a;
        this.K = K;
        int N = a.length;
        res = 0;
        val = new int[N];
        graph = new List[N];
        for (int i = 0; i < N; i++) graph[i] = new ArrayList<>();
        for (int i = 1; i < N; i++) {
            graph[a[i]].add(i);
        }
        rec(0);
        return res;
    }

    private void rec(int i) {
        for(int j:graph[i]) {
            rec(j);
            int n = (val[j]+1) % K;
            val[i] = Math.max(val[i], n);
        }
        if (val[i] == K - 1) {
            if (a[i] != 0) {
                res++;
            }
        }
    }
}

class MyScanner {
    private final InputStream in;

    public MyScanner(InputStream in) {
        this.in = in;
    }

    private static final int BUFSIZE = 65536;
    int bufLen;
    int bufPtr;
    byte[] buf = new byte[BUFSIZE];

    public int read() {
        if (bufLen == -1)
            throw new InputMismatchException();
        if (bufPtr >= bufLen) {
            bufPtr = 0;
            try {
                bufLen = in.read(buf);
            } catch (IOException e) {
                throw new InputMismatchException();
            }
            if (bufLen <= 0)
                return -1;
        }
        return buf[bufPtr++];
    }

    public int nextInt() {
        int c = read();
        if (c == -1) throw new NoSuchElementException();
        while (c != '-' && (c < '0' || '9' < c)) {
            c = read();
            if (c == -1) throw new NoSuchElementException();
        }
        if (c == '-') return -nextInt();
        int res = 0;
        do {
            res *= 10;
            res += c - '0';
            c = read();
        } while ('0' <= c && c <= '9');
        return res;
    }

}

class MyPrintWriter {
    PrintWriter out;

    public MyPrintWriter(OutputStream outputStream) {
        out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));
    }

    public void println(int a) {
        out.println(a);
    }

    public void close() {
        out.close();
    }

}

