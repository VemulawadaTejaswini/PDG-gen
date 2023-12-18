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

        int N = in.nextInt();
        int M = in.nextInt();
        int Q = in.nextInt();
        int[][] map = new int[N][N];
        for (int i=0;i<M;i++) {
            int L = in.nextInt()-1;
            int R = in.nextInt()-1;
            map[L][R]++;
        }

        // y-coodinate ruiseki
        int[][] ruiseki = new int[N][N];
        for (int i=0;i<N;i++) {
            ruiseki[i][0] = map[i][0];
        }
        for (int i=0;i<N;i++) {
            for (int j=1;j<N;j++) {
                ruiseki[i][j] = map[i][j]+ruiseki[i][j-1];
            }
        }
        for (int i=0;i<Q;i++) {
            int p = in.nextInt()-1;
            int q = in.nextInt()-1;
            int ans = 0;
            for (int j=p;j<=q;j++) {
                if (p==0) {
                    ans += ruiseki[j][q];
                } else {
                    ans += ruiseki[j][q]-ruiseki[j][p-1];
                }
            }
            out.println(ans);
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
