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
        long[][] edge = new long[N][N];
        long[][] edge_2 = new long[N][N];
        for (int i=0;i<M;i++) {
            int a = in.nextInt()-1;
            int b = in.nextInt()-1;
            int c = in.nextInt();
            edge[a][b]=c;
            edge[b][a]=c;
            edge_2[a][b]=c;
            edge_2[b][a]=c;
        }

        for (int k=0;k<N;k++) {
            for (int i=0;i<N;i++) {
                for (int j=0;j<N;j++) {
                    edge_2[i][j] = Math.min(edge_2[i][j], edge_2[i][k]+edge_2[k][j]);
                }
            }
        }

        int ans = 0;
        for (int i=0;i<N;i++) {
            for (int j=i;j<N;j++) {
                if (edge[i][j]!=edge_2[i][j]) {
                    ans++;
                }
            }
        }
        out.println(ans);
        // out.println(Arrays.deepToString(edge));
        // out.println(Arrays.deepToString(edge_2));

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
