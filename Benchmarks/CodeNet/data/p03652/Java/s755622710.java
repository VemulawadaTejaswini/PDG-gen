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
        int[][] A = new int[N][M];
        for (int i=0;i<N;i++) {
            for (int j=0;j<M;j++) {
                A[i][j] = in.nextInt()-1;
            }
        }

        boolean[][] flag = new boolean[N][M];
        long ans = 1_000_000_000_000_000L;
        for (int l=0;l<M;l++) {
            HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
            int max_val = 0;
            for (int i=0;i<N;i++) {
                for (int j=0;j<M;j++) {
                    // if (flag[i][A[i][j]]) continue;
                    if (flag[i][j]) continue;
                    if (map.containsKey(A[i][j])) {
                        map.put(A[i][j], map.get(A[i][j])+1);
                    } else {
                        map.put(A[i][j], 1);
                    }
                    max_val = Math.max(max_val, map.get(A[i][j]));
                    break;
                }
            }
            // out.println(max_val);
            ans = Math.min(ans, max_val);

            ArrayList<Integer> k = new ArrayList<Integer>(map.keySet());
            ArrayList<Integer> v = new ArrayList<Integer>(map.values());
            int max_key = 0;
            for (int j=0;j<v.size();j++) {
                if (v.get(j)==max_val) {
                    max_key=k.get(j);
                    break;
                }
            }
            // out.println(max_key);
            // for (int j=0;j<N;j++) {
            //     flag[j][max_key]=true;
            // }
            for (int i=0;i<N;i++) {
                for (int j=0;j<M;j++) {
                    if (A[i][j]==max_key) flag[i][j]=true;
                }
            }
        }
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
