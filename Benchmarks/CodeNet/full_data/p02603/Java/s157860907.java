
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.UncheckedIOException;
import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.List;
import java.util.Objects;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Main {
    public void exec() {
        int n = stdin.nextInt();
        int[] a = stdin.nextIntArray(n);

        Deque<List<Range>> stack = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (a[i] < a[j]) {
                    Range range = new Range();
                    range.x = i;
                    range.y = j;
                    stack.addLast(Arrays.asList(range));
                }
            }
        }

        List<Range> max = Collections.emptyList();
        while (!stack.isEmpty()) {
            List<Range> ranges = stack.removeLast();
            if (max.stream().mapToInt(range -> a[range.y] - a[range.x]).sum() < ranges.stream().mapToInt(range -> a[range.y] - a[range.x]).sum()) {
                max = ranges;
            }

            Range last = ranges.get(ranges.size() - 1);
            for (int i = last.y + 1; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (a[i] < a[j]) {
                        Range range = new Range();
                        range.x = i;
                        range.y = j;
                        List<Range> next = new ArrayList<>(ranges);
                        next.add(range);
                        stack.addLast(next);
                    }
                }
            }
        }

        int money = 1000;
        for (Range range : max) {
            money = (money % a[range.x]) + (money / a[range.x] * a[range.y]);
        }
        stdout.println(money);
    }

    private class Range {
        private int x;
        private int y;
        @Override
        public String toString() {
            return "Range [x=" + x + ", y=" + y + "]";
        }
    }

    private static final Stdin stdin = new Stdin();
    private static final Stdout stdout = new Stdout();

    public static void main(String[] args) {
        new Main().exec();
        stdout.flush();
    }

    public static class Stdin {
        private BufferedReader stdin;
        private Deque<String> tokens;
        private Pattern delim;

        public Stdin() {
            stdin = new BufferedReader(new InputStreamReader(System.in));
            tokens = new ArrayDeque<>();
            delim = Pattern.compile(" ");
        }

        public String nextString() {
            try {
                if (tokens.isEmpty()) {
                    String line = stdin.readLine();
                    delim.splitAsStream(line).forEach(tokens::addLast);
                }
                return tokens.pollFirst();
            } catch (IOException e) {
                throw new UncheckedIOException(e);
            }
        }

        public int nextInt() {
            return Integer.parseInt(nextString());
        }

        public double nextDouble() {
            return Double.parseDouble(nextString());
        }

        public long nextLong() {
            return Long.parseLong(nextString());
        }

        public String[] nextStringArray(int n) {
            String[] a = new String[n];
            for (int i = 0; i < n; i++) a[i] = nextString();
            return a;
        }

        public int[] nextIntArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = nextInt();
            return a;
        }

        public double[] nextDoubleArray(int n) {
            double[] a = new double[n];
            for (int i = 0; i < n; i++) a[i] = nextDouble();
            return a;
        }

        public long[] nextLongArray(int n) {
            long[] a = new long[n];
            for (int i = 0; i < n; i++) a[i] = nextLong();
            return a;
        }
    }

    public static class Stdout {
        private PrintWriter stdout;

        public Stdout() {
            stdout =  new PrintWriter(System.out, false);
        }

        public void printf(String format, Object ... args) {
            stdout.printf(format, args);
        }

        public void println(Object ... objs) {
            String line = Arrays.stream(objs).map(this::deepToString).collect(Collectors.joining(" "));
            stdout.println(line);
        }

        private String deepToString(Object o) {
            if (o == null || !o.getClass().isArray()) {
                return Objects.toString(o);
            }

            int len = Array.getLength(o);
            String[] tokens = new String[len];
            for (int i = 0; i < len; i++) {
                tokens[i] = deepToString(Array.get(o, i));
            }
            return "{" + String.join(",", tokens) + "}";
        }

        public void flush() {
            stdout.flush();
        }
    }
}
