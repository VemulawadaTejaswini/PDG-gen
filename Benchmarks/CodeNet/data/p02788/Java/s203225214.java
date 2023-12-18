import java.io.*;
import java.util.*;

public class Main {
    public static final int MOD = (int) (1e9 + 7);

    class Monster {
        int x, h;

        public Monster(int x, int h) {
            this.x = x;
            this.h = h;
        }
    }

    class Event {
        int x;
        int t;

        public Event(int x, int t) {
            this.x = x;
            this.t = t;
        }
    }

    public void solve(InputReader in, PrintWriter out) {
        int n = in.nextInt(), d = in.nextInt(), a = in.nextInt();
        Monster[] monsters = new Monster[n];
        for (int i = 0; i < n; ++i) {
            monsters[i] = new Monster(in.nextInt(), in.nextInt());
        }

        Arrays.sort(monsters, Comparator.comparingInt(x -> x.x));

        long cost = 0;
        int explosion = 0;
        Queue<Event> q = new LinkedList<>();
        for (int i = 0; i < n; ++i) {
            while (!q.isEmpty() && monsters[i].x > q.peek().x + d) {
                explosion -= q.peek().t * a;
                q.poll();
            }
            if (explosion < monsters[i].h) {
                int t = (monsters[i].h - explosion + a - 1) / a;
                q.add(new Event(monsters[i].x + d, t));
                explosion += t * a;
                cost += t;
            }
        }

        out.println(cost);
    }

    public static void main(String[] args) {
        InputReader in = new InputReader(System.in);
        PrintWriter out = new PrintWriter(System.out);
        new Main().solve(in, out);
        out.flush();
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
