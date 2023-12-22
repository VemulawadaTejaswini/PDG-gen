import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {


    public static void main(String[] args) throws IOException {
        new Main().solve();
    }

    private void solve() throws IOException {
        BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        StringTokenizer tokenizer = new StringTokenizer(f.readLine());
        int a = Integer.parseInt(tokenizer.nextToken());
        int b = Integer.parseInt(tokenizer.nextToken());
        int c = Integer.parseInt(tokenizer.nextToken());
        int k = Integer.parseInt(f.readLine());
        int needed = 0;
        while (b <= a) {
            b *= 2;
            needed++;
        }
        while (c <= b) {
            c *= 2;
            needed++;
        }

        if (needed <= k) {
            out.println("Yes");
        } else {
            out.println("No");
        }
        out.close();
    }
}