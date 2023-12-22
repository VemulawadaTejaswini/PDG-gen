import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;

public class Main {

    private final BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    private final PrintWriter out = new PrintWriter(System.out);

    public void solve() throws IOException {
        BigInteger max = new BigInteger("1000000000000000000");
        int n = Integer.parseInt(in.readLine());
        String[] ints = in.readLine().split(" ");
        BigInteger ans = BigInteger.valueOf(1);
        for (String i : ints) {
            ans = ans.multiply(new BigInteger(i));
        }
        out.println(ans.compareTo(max) == 1 ? -1 : ans);
    }

    private void go() throws IOException {
        solve();
        in.close();
        out.close();
    }

    public static void main(String[] args) throws IOException {
        new Main().go();
    }
}