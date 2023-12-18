//package AtCoder.Indeed10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        int n = in.NI();
        List<Long> q = new ArrayList<>(n);
        for (int i=0;i<n;i++) q.add(in.NL());

        long fans = Long.MAX_VALUE;

        long sign = 1; long presum = 0;
        long ans = func(n, q, sign, presum);

        fans = Long.min(fans, ans);

        sign = -1; presum = 0;
        ans = func(n, q, sign, presum);

        fans = Long.min(fans, ans);

        out.println(fans);
        out.close();
    }

    private static long func(final int n, final List<Long> q, long sign, long presum) {
        long ans  =0;
        for (int i=0;i<n;i++) {
            presum+=q.get(i);
            if (presum*sign > 0) { sign = sign*-1L;  continue; }
            if (presum==0) {
                if (sign==1) {ans++; presum++;}
                else {ans++; presum--;}
            } else if (presum>0) {
                ans += (1+presum);
                presum = -1;
            } else {
                ans += (1-presum);
                presum = 1;
            }
            sign = sign * -1L;
        }
        return ans;
    }

    static InputStream inputStream = System.in;
    static OutputStream outputStream = System.out;
    static InputReader in = new InputReader(inputStream);
    static PrintWriter out = new PrintWriter(outputStream);

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int NI() {
            return Integer.parseInt(next());
        }

        public long NL() {
            return Long.parseLong(next());
        }

    }
}