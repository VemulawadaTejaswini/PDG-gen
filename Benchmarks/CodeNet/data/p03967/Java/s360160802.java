import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {

    public void solve() {
        char[] s = in.next().toCharArray();
        int n = s.length;
        int score = 0;
        int paper = 0;
        int rock = 0;
        for (int i = 0; i < n; i++) {
            if (s[i] == 'g') {
                if (paper < rock) {
                    paper++;
                    score++;
                } else {
                    rock++;
                }
            } else {
                if (paper < rock) {
                    paper++;
                } else {
                    rock++;
                    score--;
                }
            }
        }
        out.println(score);
    }

    public static void main(String[] args)throws IOException {
        FastScanner in;
        boolean isLocalRun = args.length >= 1 && "local_run".equals(args[0]);
        if (isLocalRun)
            in = new FastScanner(new FileInputStream("input"));
        else
            in = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int testsCount = 1;
        for (int testNum = 0; testNum < testsCount; testNum++)
            new Main(in, out).solve();
        in.close();
        out.close();
    }

    final PrintWriter out;
    final FastScanner in;

    public Main(FastScanner in, PrintWriter out) {
        this.in = in;
        this.out = out;
    }
}

class FastScanner {
    private StringTokenizer tokenizer;
    private BufferedReader reader;

    public FastScanner(InputStream inputStream) {
        reader = new BufferedReader(new InputStreamReader(inputStream));
    }

    public String next() {
        while (tokenizer == null || !tokenizer.hasMoreTokens()) {
            String line;
            try {
                line = reader.readLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            if (line == null)
                return null;
            tokenizer = new StringTokenizer(line);
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

    public String nextLine() {
        String line;
        try {
            line = reader.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        tokenizer = null;
        return line;
    }

    public void close() {
        try {
            reader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

