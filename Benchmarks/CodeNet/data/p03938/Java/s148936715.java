import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

import java.util.*;

public class Main {

    static int DAT_SIZE = (1<<18)-1;

    static long[] data = new long[DAT_SIZE];
    static long[] datb = new long[DAT_SIZE];

    static void add(int a, int b, int x, int k, int l, int r) {
        if (a<=l && r<=b) {
            data[k] += x;
        } else if (l<b && a<r) {
            datb[k] += (Math.min(b, r) - Math.max(a, l))*x;
            add(a, b, x, k*2+1, l, (l+r)/2);
            add(a, b, x, k*2+2, (l+r)/2, r);
        }
    }

    static long sum(int a, int b, int k, int l, int r) {
        if (b<=l || r<=a) {
            return 0;
        } else if (a<=l && r<=b) {
            return data[k]*(r-l)+datb[k];
        } else {
            long res = (Math.min(b, r) - Math.max(a, l)) * data[k];
            res += sum(a, b, k*2+1, l, (l+r)/2);
            res += sum(a, b, k*2+2, (l+r)/2, r);
            return res;
        }
    }

    static long[] datc = new long[DAT_SIZE];
    static long[] datd = new long[DAT_SIZE];

    static void add_2(int a, int b, int x, int k, int l, int r) {
        if (a<=l && r<=b) {
            datc[k] += x;
        } else if (l<b && a<r) {
            datd[k] += (Math.min(b, r) - Math.max(a, l))*x;
            add_2(a, b, x, k*2+1, l, (l+r)/2);
            add_2(a, b, x, k*2+2, (l+r)/2, r);
        }
    }

    static long sum_2(int a, int b, int k, int l, int r) {
        if (b<=l || r<=a) {
            return 0;
        } else if (a<=l && r<=b) {
            return datc[k]*(r-l)+datd[k];
        } else {
            long res = (Math.min(b, r) - Math.max(a, l)) * datc[k];
            res += sum_2(a, b, k*2+1, l, (l+r)/2);
            res += sum_2(a, b, k*2+2, (l+r)/2, r);
            return res;
        }
    }

    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);

        int N = in.nextInt();
        int[] p = new int[N];
        int[] inv = new int[N];
        for (int i=0;i<N;i++) {
            p[i] = in.nextInt()-1;
            inv[p[i]] = i;
        }

        for (int i=0;i<N;i++) {
            add(i, i+1, i+1, 0, 0, N);
            add_2(N-1-i, N-i, i+1, 0, 0, N);
        }
        for (int i=N-1;i>=0;i--) {
            add(inv[i], N, i+1, 0, 0, N);
            add_2(0, inv[i]+1, i+1, 0, 0, N);
        }


        for (int i=0;i<N;i++) {
            if (i!=N-1) {
                out.print(sum(i, i+1, 0, 0, N)+" ");
            } else {
                out.println(sum(i, i+1, 0, 0, N));
            }
        }

        for (int i=0;i<N;i++) {
            if (i!=N-1) {
                out.print(sum_2(i, i+1, 0, 0, N)+" ");
            } else {
                out.println(sum_2(i, i+1, 0, 0, N));
            }
        }
        out.close();
    }

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

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

    }
}
