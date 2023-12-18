import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;


public class Main {

    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;

        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);

        Task solver = new Task();
        solver.solve(in, out);
        out.close();
    }
}

class Task {

    boolean check(int k, int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] != k && a[i] != k - 1)
                return false;
        }
        int nc = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == k - 1) nc++;
        }
        if (nc > k) return false;
        if (k == nc && a.length - nc > 0) return false;
        if (k != nc && (a.length - nc) / (k - nc) < 2) return false;
        return true;
    }

    public void solve(InputReader in, PrintWriter out) {
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        int x = a[0], y = a[0] + 1;
        boolean ok = check(x ,a) | check(y, a);
        out.println(ok ? "Yes" : "No");
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
