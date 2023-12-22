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

        int n = Integer.parseInt(f.readLine());
        StringTokenizer tokenizer = new StringTokenizer(f.readLine());
        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = Integer.parseInt(tokenizer.nextToken());
        }
        long sum = 0;
        long res = 0;
        int mod = 1000000007;
        for (int i = 0; i < n; i++) {
            res += sum * ar[i];
            res %= mod;
            sum += ar[i];
            sum %= mod;
        }

        out.println(res);

        out.close();
    }
}  