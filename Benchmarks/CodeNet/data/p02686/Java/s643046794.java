import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

import static java.util.Arrays.binarySearch;
import static java.util.Arrays.copyOfRange;
import static java.util.Arrays.sort;

public class Main {

    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;

        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);

        Task solver = new Task();
        solver.solve(1, in, out);
        out.close();
    }
}

class Task {

    private static int mod = 998244353;

    public void solve(int testNumber, InputReader in, PrintWriter out) {
        // a > 0 b >= 0 b1 > b2
        // a > 0 b1 > b2
        // a < 0 b1 > b2
        int n = in.nextInt();
        BraketString[] bs = new BraketString[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            char[] s = in.next().toCharArray();
            int a = 0, b = 0;
            for (int j = 0; j < s.length; j++) {
                if (s[j] == '(') {
                    a++;
                } else {
                    a--;
                }
                b = Math.min(b, a);
            }
            sum += a;
            bs[i] = new BraketString(a, b);
        }
        if (sum != 0) {
            out.println("No");
            return;
        }
        Arrays.sort(bs, new Comparator<BraketString>() {
            @Override
            public int compare(BraketString o1, BraketString o2) {
                if (o1.a == 0 && o2.a == 0) {
                    return o2.b - o1.b;
                }
                if ((long)o1.a * o2.a <= 0) {
                    return o2.a - o1.a;
                }
                return o2.b - o1.b;
            }
        });
        int tmp = 0;
        boolean ok = true;
        for (int i = 0; i < n; i++) {
            if (tmp + bs[i].b < 0) {
                ok = false;
                break;
            }
            tmp += bs[i].a;
        }
        out.println(ok ? "Yes" : "No");
    }

    class BraketString {
        int a;
        int b;

        public BraketString(int a, int b) {
            this.a = a;
            this.b = b;
        }
    }

}

class InputReader {

    private final BufferedReader reader;
    private StringTokenizer tokenizer;

    public InputReader(InputStream stream) {
        reader = new BufferedReader(new InputStreamReader(stream));
        tokenizer = null;
    }

    public String nextLine() {
        try {
            return reader.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String next() {
        while (tokenizer == null || !tokenizer.hasMoreTokens()) {
            tokenizer = new StringTokenizer(nextLine());
        }
        return tokenizer.nextToken();
    }

    public int nextInt() {
        return Integer.parseInt(next());
    }

    public long nextLong() {
        return Long.parseLong(next());
    }

    public double nextDouble() {
        return Double.parseDouble(next());
    }

}
