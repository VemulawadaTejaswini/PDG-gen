
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner sc = new Scanner();
        PrintWriter out = new PrintWriter(System.out);
        PriorityQueue<Apple> apples = new PriorityQueue<>();
        int x = sc.nextInt(), y = sc.nextInt(), a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        long ans = 0;
        while (a-- > 0)
            apples.add(new Apple(0, sc.nextInt()));
        while (b-- > 0)
            apples.add(new Apple(1, sc.nextInt()));
        while (c-- > 0) apples.add(new Apple(2, sc.nextInt()));
        int[] ate = new int[]{x, y, 0};
        while (ate[0] + ate[1] > ate[2]) {
            Apple cur = apples.remove();
            if (cur.c == 2) {
                ans += cur.d;
                ate[cur.c]++;
            } else if (ate[cur.c] > 0) {
                ans += cur.d;
                ate[cur.c]--;
            }
        }
        out.println(ans);
        out.flush();
        out.close();
    }

    static class Apple implements Comparable<Apple> {
        int c, d;

        Apple(int c, int d) {
            this.c = c;
            this.d = d;
        }

        @Override
        public int compareTo(Apple apple) {
            return apple.d - d;
        }
    }


    static class Scanner {
        BufferedReader br;
        StringTokenizer st;

        boolean ready() throws IOException {
            return br.ready();
        }

        double nextDouble() throws IOException {
            return Double.parseDouble(next());
        }

        Scanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() throws IOException {
            while (st == null || !st.hasMoreTokens())
                st = new StringTokenizer(br.readLine());
            return st.nextToken();
        }

        int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        int nextChar() throws IOException {
            return next().charAt(0);
        }

        int[] nextIntArray(int n) throws IOException {
            int[] ans = new int[n];
            for (int i = 0; i < n; i++)
                ans[i] = nextInt();
            return ans;
        }

        long nextLong() throws IOException {
            return Long.parseLong(next());
        }

    }
}
