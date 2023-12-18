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
        Scanner sc = new Scanner(System.in);
        int V = Integer.parseInt(sc.next());
        int E = Integer.parseInt(sc.next());
        ArrayList<ArrayList<int[]>> edge = new ArrayList<ArrayList<int[]>>();
        for (int i=0;i<V;i++) {
            ArrayList<int[]> add = new ArrayList<int[]>();
            edge.add(add);
        }
        for (int i=0;i<E;i++) {
            int s = Integer.parseInt(sc.next())-1;
            int t = Integer.parseInt(sc.next())-1;
            int d = Integer.parseInt(sc.next());
            int[] add = {t, d};
            edge.get(s).add(add);
        }
        for (int i=1;i<V;i++) {
            int[] add = {i-1, 0};
            edge.get(i).add(add);
        }
        Comparator<int[]> comparator = new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return Integer.compare(o1[1], o2[1]);
            }
        };
        int[] ans = new int[V];
        for (int i=0;i<V;i++) {
            ans[i] = -1;
        }
        PriorityQueue<int[]> queue = new PriorityQueue<int[]>(comparator);
        int[] flag = new int[V];
        int[] first = {0, 0};
        queue.add(first);
        while(!queue.isEmpty()) {
            int[] rem = queue.remove();
            if (flag[rem[0]]==1) {
                continue;
            }
            flag[rem[0]]=1;
            ans[rem[0]] = rem[1];
            // System.out.println("rem: " + Arrays.toString(rem));
            for (int[] tmp : edge.get(rem[0])) {
                int[] add = {tmp[0], tmp[1]+rem[1]};
                queue.add(add);
            }
        }
            if (ans[V-1]==-1) {
                System.out.println(-1);
            } else {
                System.out.println(ans[V-1]);
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
