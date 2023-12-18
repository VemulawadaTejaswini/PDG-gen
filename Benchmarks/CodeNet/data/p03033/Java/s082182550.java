import java.io.*;
import java.util.*;
import java.util.function.Function;

public class Main {

    static int N, Q;
    static Kouji[] K;
    static int[] D;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        N = sc.nextInt();
        Q = sc.nextInt();
        K = new Kouji[N];
        for (int i = 0; i < N; i++) {
            K[i] = new Kouji(sc.nextInt(), sc.nextInt(), sc.nextInt());
        }
        D = sc.nextIntArray(Q);

        writeLines(solve());
    }

    static int[] solve() {
        List<Event> events = new ArrayList<>(N*2 + Q + 10);

        for (int i = 0; i < N; i++) {
            Kouji k = K[i];
            events.add( new Event(k.s - k.x, EventType.KOUJI_START, k.x) );
            events.add( new Event(k.t - k.x, EventType.KOUJI_END, k.x) );
        }
        for (int i = 0; i < Q; i++) {
            events.add( new Event(D[i], EventType.Q, i) );
        }
        events.sort(Comparator.comparingInt(e -> e.t));

        int[] ans = new int[Q];
        // min x
        PriorityQueue<Integer> q = new PriorityQueue<>();
        // x -> cnt
        Map<Integer, Integer> cnt = new HashMap<>();
        for (Event event : events) {
            // debug(event.t, event.type, event.x);
            if( event.type == EventType.KOUJI_START) {
                if( cnt.containsKey(event.x) ) {
                    cnt.put(event.x, cnt.get(event.x)+1);

                } else {
                    q.add(event.x);
                    cnt.put(event.x, 1);
                }

            } else if( event.type == EventType.KOUJI_END) {
                int c = cnt.get(event.x);
                c--;
                if( c == 0 ) {
                    cnt.remove(event.x);

                } else {
                    cnt.put(event.x, c);
                }

            } else {
                // query
                int x = -1;
                while(!q.isEmpty()) {
                    int y = q.peek();
                    if( cnt.containsKey(y) ) {
                        x = y;
                        break;
                    } else {
                        q.poll(); // suteru
                    }
                }
                ans[event.x] = x;
            }
        }
        return ans;
    }

    enum EventType {
        KOUJI_START, KOUJI_END, Q;
    }

    static class Event {
        int t;
        EventType type;
        int x;

        public Event(int t, EventType type, int x) {
            this.t = t;
            this.type = type;
            this.x = x;
        }
    }

    static class Kouji {
        int s, t, x;

        public Kouji(int s, int t, int x) {
            this.s = s;
            this.t = t;
            this.x = x;
        }
    }

    @SuppressWarnings("unused")
    static class FastScanner {
        private BufferedReader reader;
        private StringTokenizer tokenizer;

        FastScanner(InputStream in) {
            reader = new BufferedReader(new InputStreamReader(in));
            tokenizer = null;
        }

        String next() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        String nextLine() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    return reader.readLine();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken("\n");
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        int[] nextIntArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = nextInt();
            return a;
        }

        int[] nextIntArray(int n, int delta) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = nextInt() + delta;
            return a;
        }

        long[] nextLongArray(int n) {
            long[] a = new long[n];
            for (int i = 0; i < n; i++)
                a[i] = nextLong();
            return a;
        }
    }

    static <A> void writeLines(A[] as, Function<A, String> f) {
        PrintWriter pw = new PrintWriter(System.out);
        for (A a : as) {
            pw.println(f.apply(a));
        }
        pw.flush();
    }

    static void writeLines(int[] as) {
        PrintWriter pw = new PrintWriter(System.out);
        for (int a : as) pw.println(a);
        pw.flush();
    }

    static void writeLines(long[] as) {
        PrintWriter pw = new PrintWriter(System.out);
        for (long a : as) pw.println(a);
        pw.flush();
    }

    static int max(int... as) {
        int max = Integer.MIN_VALUE;
        for (int a : as) max = Math.max(a, max);
        return max;
    }

    static int min(int... as) {
        int min = Integer.MAX_VALUE;
        for (int a : as) min = Math.min(a, min);
        return min;
    }

    static void debug(Object... args) {
        StringJoiner j = new StringJoiner(" ");
        for (Object arg : args) {
            if (arg instanceof int[]) j.add(Arrays.toString((int[]) arg));
            else if (arg instanceof long[]) j.add(Arrays.toString((long[]) arg));
            else if (arg instanceof double[]) j.add(Arrays.toString((double[]) arg));
            else if (arg instanceof Object[]) j.add(Arrays.toString((Object[]) arg));
            else j.add(arg.toString());
        }
        System.err.println(j.toString());
    }
}
