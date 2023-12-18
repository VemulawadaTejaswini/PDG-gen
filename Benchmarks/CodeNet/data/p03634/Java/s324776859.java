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
        ArrayList<ArrayList<int[]>> edge = new ArrayList<ArrayList<int[]>>();
        for (int i=0;i<N;i++) {
            ArrayList<int[]> add = new ArrayList<int[]>();
            edge.add(add);
        }
        for (int i=0;i<N-1;i++) {
            int a = in.nextInt()-1;
            int b = in.nextInt()-1;
            int c = in.nextInt();
            int[] add_1 = {b, c};
            int[] add_2 = {a, c};
            edge.get(a).add(add_1);
            edge.get(b).add(add_2);
        }

        int Q = in.nextInt();
        int K = in.nextInt();
        ArrayDeque<long[]> queue = new ArrayDeque<long[]>();
        int[] flag = new int[N];
        long[] cost = new long[N];
        long[] init = {(long)K-1, 0};
        queue.add(init);
        while(!queue.isEmpty()) {
            long[] rem = queue.poll();
            if (flag[(int)rem[0]]==1) {
                continue;
            }
            flag[(int)rem[0]]=1;
            cost[(int)rem[0]]=rem[1];

            for (int[] tmp : edge.get((int)rem[0])) {
                long[] add = {(long)tmp[0], rem[1]+(long)tmp[1]};
                queue.add(add);
            }
        }
        for (int i=0;i<Q;i++) {
            int x = in.nextInt();
            int y = in.nextInt();
            out.println((cost[x-1]+cost[y-1]));
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
