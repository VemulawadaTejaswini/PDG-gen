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
        // ArrayList<ArrayList<Integer>> edge = new ArrayList<ArrayList<Integer>>();
        // for (int i=0;i<N;i++) {
        //     ArrayList<Integer> add = new ArrayList<Integer>();
        //     edge.add(add);
        // }
        // for (int i=0;i<N-1;i++) {
        //     int a = in.nextInt()-1;
        //     int b = in.nextInt()-1;
        //     edge.get(a).add(b);
        //     edge.get(b).add(a);
        // }
        ArrayList<ArrayList<int[]>> edge = new ArrayList<ArrayList<int[]>>();
        for (int i=0;i<N;i++) {
            ArrayList<int[]> add = new ArrayList<int[]>();
            edge.add(add);
        }
        for (int i=0;i<N-1;i++) {
            int a = in.nextInt()-1;
            int b = in.nextInt()-1;
            int[] add_a = {b, i};
            int[] add_b = {a, i};
            edge.get(a).add(add_a);
            edge.get(b).add(add_b);
        }

        // int[] ans = new int[N];
        // ArrayDeque<int[]> queue = new ArrayDeque<int[]>();
        // int[] first = {0, 1};
        // queue.add(first);
        int[] flag = new int[N];
        int[] ans = new int[N-1];
        ArrayDeque<int[]> queue = new ArrayDeque<int[]>();
        int[] first = {0, -1};
        queue.add(first);
        int mmm = 0;
        while (!queue.isEmpty()) {
            int[] rem = queue.remove();
            if (flag[rem[0]]==1) continue;
            flag[rem[0]]=1;

            int aaa = 0;
            for (int[] arr : edge.get(rem[0])) {
                int i = arr[0];
                int index = arr[1];

                if (flag[i]==1) continue;
                aaa++;
                if (aaa==rem[1]) aaa++;
                ans[index]=aaa;
                mmm = Math.max(mmm, aaa);
                // int[] add = {i, aaa};
                if (flag[i]==0) {
                    int[] add = {i, aaa};
                    queue.add(add);
                }
            }
        }
        System.out.println(mmm);
        for (int i=0;i<N-1;i++) {
            System.out.println(ans[i]);
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
