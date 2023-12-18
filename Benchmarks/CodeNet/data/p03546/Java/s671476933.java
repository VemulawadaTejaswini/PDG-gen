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
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);

        int H = in.nextInt();
        int W = in.nextInt();
        long[][] c = new long[10][10];
        for (int i=0;i<10;i++) {
            for (int j=0;j<10;j++) {
                c[i][j] = in.nextInt();
            }
        }
        int[] cnt = new int[10];
        for (int i=0;i<H;i++) {
            for (int j=0;j<W;j++) {
                int a = in.nextInt();
                if (a!=-1) {
                    cnt[a]++;
                }
            }
        }

        for (int i=0;i<10;i++) {
            for (int k=0;k<10;k++) {
                for (int j=0;j<10;j++) {
                    c[i][j] = Math.min(c[i][j], c[i][k]+c[k][j]);
                }
            }
        }
        for (int i=0;i<10;i++) {
            for (int k=0;k<10;k++) {
                for (int j=0;j<10;j++) {
                    c[i][j] = Math.min(c[i][j], c[i][k]+c[k][j]);
                }
            }
        }
        long ans = 0L;
        for (int i=0;i<10;i++) {
            ans += cnt[i]*c[i][1];
        }
        // System.out.println(Arrays.toString(cnt));
        // System.out.println(Arrays.deepToString(c));
        out.println(ans);
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
