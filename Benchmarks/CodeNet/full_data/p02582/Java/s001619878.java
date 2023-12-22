import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) throws IOException {
        new Main().solve();
    }

    private void solve() throws IOException {
        BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        char[] seq = f.readLine().toCharArray();
        int r = 0;
        int max = 0;
        for (int i = 0; i < seq.length; i++) {
            if (seq[i] == 'R') r++;
            else  r = 0;
            max = Math.max(r, max);
        }

        out.println(max);
        out.close();
    }
}
