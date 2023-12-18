import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

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

    public void solve(int testNumber, InputReader in, PrintWriter out) {
        long n = in.nextLong();
        long ans = 0;
        Set<Integer> set = new HashSet();
        for (int i = 0; i < n; i++) {
            int x = in.nextInt();
            if (set.contains(x)) {
                ans++;
            } else {
                set.add(x);
            }
        }
        List a = new ArrayList(set);
        Collections.sort(a);
        for (int i = 0; i < a.size(); i++) {
            if ((Integer)(a.get(i)) != i + 1) {
                ans += a.size() - i;
                break;
            }
        }
        out.println(ans == n ? -1 : ans);

    }

    private long gcd(long a, long b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

}

class InputReader {

    private final BufferedReader reader;
    private StringTokenizer      tokenizer;

    public InputReader(InputStream stream){
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
