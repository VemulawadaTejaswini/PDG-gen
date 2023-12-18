import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.System.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {

    static void solve() throws Exception {
        long n = scanLong();

        ExecutorService service = Executors.newFixedThreadPool(Integer.MAX_VALUE);
        List<Future<Boolean>> retList = new ArrayList<>();
        long count = 0;
        for (long k = 2; k <= n; k++) {
            TestCallable test = new TestCallable(n, k);
            retList.add(service.submit(test));
        }
        for (int i = 0; i < retList.size(); i++) {
            Future<Boolean> f = retList.get(i);
            if (f.get()) {
                count++;
            }
        }
        service.shutdown();
        out.print(count);
    }

    public static class TestCallable implements Callable<Boolean> {

        private long n = 0;
        private long k = 0;
        public TestCallable(long n, long k) {
            this.n = n;
            this.k = k;
        }

        @Override
        public Boolean call() {
            while (n > 1) {
                if (n % k == 0) {
                    n /= k;
                } else {
                    n -= k;
                }
            }
            return n == 1 ? true : false;
        }
    }

    static int scanInt() throws IOException {
        return parseInt(scanString());
    }

    static long scanLong() throws IOException {
        return parseLong(scanString());
    }

    static String scanString() throws IOException {
        while (tok == null || !tok.hasMoreTokens()) {
            tok = new StringTokenizer(in.readLine());
        }
        return tok.nextToken();
    }

    static BufferedReader in;
    static PrintWriter out;
    static StringTokenizer tok;

    public static void main(String[] args) {
        try {
            in = new BufferedReader(new InputStreamReader(System.in));
            out = new PrintWriter(System.out);
            solve();
            in.close();
            out.close();
        }
        catch (Throwable e) {
            e.printStackTrace();
            exit(1);
        }
    }
}