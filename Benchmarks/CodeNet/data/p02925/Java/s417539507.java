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
        ArrayList<ArrayDeque<Integer>> plan = new ArrayList<ArrayDeque<Integer>>();
        for (int i=0;i<N;i++) {
            ArrayDeque<Integer> queue = new ArrayDeque<Integer>();
            for (int j=0;j<N-1;j++) {
                int A = in.nextInt()-1;
                queue.add(A);
            }
            plan.add(queue);
        }
        // out.println(plan);

        boolean[] visited = new boolean[N];
        int ans = 0;
        int j=0;
        while (j<100000) {
            boolean flag = false;
            boolean flag_2 = false;
            Arrays.fill(visited, false);
            for (int i=0;i<N;i++) {
                if (visited[i]) continue;
                if (plan.get(i).isEmpty()) continue;

                // int tmp = i;
                int before = i;
                visited[before] = true;
                int tmp = plan.get(before).peek();
                while (true) {
                    if (visited[tmp]) break;
                    visited[tmp] = true;
                    if (plan.get(tmp).isEmpty()) break;
                    int rem = plan.get(tmp).peek();
                    if (before==rem) {
                        plan.get(before).poll();
                        plan.get(tmp).poll();
                        flag=true;
                        break;
                    }
                    before = tmp;
                    tmp = rem;
                }
                flag_2 = true;
            }
            ans++;
            if (!flag && flag_2) {
                out.println("-1");
                out.close();
                return;
            }
            if (j==99999){
                out.println(ans-1);
                out.close();
                return;
            }
            if (!flag) break;
        }
        out.println(ans-1);

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
