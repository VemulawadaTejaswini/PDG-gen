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
        for (int i=0;i<N;i++) {
            for (int j=0;j<N;j++) {
                if (i!=j) {
                    edge[i][j]=1_000_000_000_000L;
                    edge_2[i][j]=1_000_000_000_000L;
                }
            }
        }
        int[] a = new int[M];
        int[] b = new int[M];
        int[] c = new int[M];
        for (int i=0;i<M;i++) {
            a[i] = in.nextInt()-1;
            b[i] = in.nextInt()-1;
            c[i] = in.nextInt();
            edge[a[i]][b[i]]=c[i];
            edge[b[i]][a[i]]=c[i];
            edge_2[a[i]][b[i]]=c[i];
            edge_2[b[i]][a[i]]=c[i];
        }

        for (int k=0;k<N;k++) {
            for (int i=0;i<N;i++) {
                for (int j=0;j<N;j++) {
                    edge_2[i][j] = Math.min(edge_2[i][j], edge_2[i][k]+edge_2[k][j]);
                }
            }
        }
        int ans = 0;
        for (int k=0;k<M;k++) {
            int s = a[k];
            int t = b[k];
            int cost = c[k];
            int flag=0;
            for (int i=0;i<N;i++) {
                for (int j=0;j<N;j++) {
                    if (edge_2[i][j] == edge[i][s] + cost + edge[t][j]) {
                        flag=1;
                    }
                }
            }
            if (flag==0) {
                ans++;
            }
        }

        // for (int i=0;i<N;i++) {
        //     for (int j=i;j<N;j++) {
        //         if (edge[i][j]!=edge_2[i][j]) {
        //             ans++;
        //         }
        //     }
        // }
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
