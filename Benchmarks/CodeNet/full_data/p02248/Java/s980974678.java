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

    static long mod = (1L<<25);
    static long pow(long a, long b) {
        long ans = 1L;
        long tmp = a;
        int j = 0;
        // for (int j=0;j<20;j++) {
        while (b>0) {
            if (((1L<<j)&b)==(1L<<j)) {
                ans = ans*tmp%mod;
                b-=(1L<<j);
            }
            j++;
            tmp = tmp*tmp%mod;
        }
        return ans;
    }

    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);

        char[] T = in.next().toCharArray();
        char[] S = in.next().toCharArray();
        int[] t = new int[T.length];
        int[] s = new int[S.length];
        for (int i=0;i<T.length;i++) {
            t[i] = (int)T[i]-47;
        }
        for (int i=0;i<S.length;i++) {
            s[i] = (int)S[i]-47;
        }

        long base = 1_000_000_007;
        long hash = 0L;
        for (int i=0;i<S.length;i++) {
            hash = (hash+s[i]*pow(base, S.length-1-i)%mod)%mod;
        }

        long tmp = 0L;
        for (int i=0;i<S.length;i++) {
            if (i==T.length) break;
            tmp = (tmp+t[i]*pow(base, S.length-1-i)%mod)%mod;
        }
            // System.out.println("tmp: "+tmp);
            if (hash==tmp) {
                // set.add(0);
                out.println(0);
            }
        for (int i=0;i<T.length-S.length;i++) {
            tmp = tmp*base%mod;
            tmp -= t[i]*pow(base, S.length)%mod;
            tmp = (tmp+mod)%mod;
            tmp = (tmp+t[i+S.length]);

            // System.out.println("tmp: "+tmp);
            if (hash==tmp) {
                // set.add(i+1);
                out.println(i+1);
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

