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
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        for (int i=0;i<N;i++) {
            ArrayList<Integer> add = new ArrayList<Integer>();
            list.add(add);
        }
        int[] P = new int[M];
        int[] Y = new int[M];
        for (int i=0;i<M;i++) {
            P[i] = in.nextInt()-1;
            Y[i] = in.nextInt();
            list.get(P[i]).add(Y[i]);
        }
        for (int i=0;i<N;i++) {
            ArrayList<Integer> tmp = list.get(i);
            Collections.sort(tmp);
        }

        for (int i=0;i<M;i++) {
            int index = Collections.binarySearch(list.get(P[i]), Y[i]);
            String str = String.format("%06d%06d", P[i]+1, index+1);
            out.println(str);
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
