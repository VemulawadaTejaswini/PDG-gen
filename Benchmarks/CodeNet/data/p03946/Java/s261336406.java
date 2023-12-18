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
        int T = in.nextInt();
        int[] A = new int[N];
        for (int i=0;i<N;i++) {
            A[i] = in.nextInt();
        }

        int[] max = new int[N];
        max[N-1]=A[N-1];
        for (int i=N-2;i>=0;i--) {
            max[i] = Math.max(A[i], max[i+1]);
        }

        int max_diff=0;
        for (int i=0;i<N-1;i++) {
            if (max_diff<max[i+1]-A[i]) {
                max_diff=max[i+1]-A[i];
            }
        }

        int ans=0;
        for (int i=0;i<N-1;i++) {
            if (max_diff==(max[i+1]-A[i])) {
                ans++;
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
