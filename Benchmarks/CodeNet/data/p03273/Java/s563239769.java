import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.stream.IntStream;
import java.util.Arrays;
import java.util.Collection;
import java.io.IOException;
import java.util.stream.Collectors;
import java.util.OptionalInt;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import java.util.StringTokenizer;
import java.util.Optional;
import java.io.BufferedReader;
import java.util.Comparator;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        MyScanner in = new MyScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        B solver = new B();
        solver.solve(1, in, out);
        out.close();
    }

    static class B {
        public void solve(int testNumber, MyScanner in, PrintWriter out) {
            int H = in.nextInt();
            int W = in.nextInt();
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < H; i++) {
                String a = in.next();
                int n = Integer.valueOf(a.replace('.', '0').replace('#', '1'), 2);
                if (n > 0) {
                    list.add(n);
                }
            }

            int n = 0;
            int max = list.stream().max(Comparator.naturalOrder()).get();
            while (max > (1 << n)) {
                final int m = n;
                long cnt = list.stream().filter(v -> ((v >> m) & 1) == 1).count();
                if (cnt == 0) {
                    list = list.stream().map(v -> ((v >> (m + 1)) << m) + (v % (1 << m))).collect(Collectors.toList());
                } else {
                    n++;
                    max = list.stream().max(Comparator.naturalOrder()).get();
                }
            }
            List<String> strings = list.stream()
                    .map(v -> Integer.toString(v, 2))
                    .map(s -> s.replace('1', '#').replace('0', '.'))
                    .collect(Collectors.toList());
            int size = strings.stream()
                    .mapToInt(String::length)
                    .max()
                    .getAsInt();
            char[] cs = new char[size];
            Arrays.fill(cs, '.');
            String tmp = new String(cs);
            strings.stream()
                    .map(s -> {
                        String ss = (tmp + s);
                        return ss.substring(ss.length() - size);
                    })
                    .forEach(out::println);
        }

    }

    static class MyScanner {
        private BufferedReader in;
        private StringTokenizer st;

        public MyScanner(InputStream stream) {
            in = new BufferedReader(new InputStreamReader(stream));
        }

        public String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    String rl = in.readLine();
                    if (rl == null) {
                        return null;
                    }
                    st = new StringTokenizer(rl);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

