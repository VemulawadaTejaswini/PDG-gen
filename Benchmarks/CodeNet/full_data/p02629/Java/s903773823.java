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

        long n = Long.parseLong(f.readLine());
        long increasal = 26;
        long current = 1;
        int length = 1;
        while (increasal + current <= n) {
            length++;
            current += increasal;
            increasal *= 26;
        }
        int[] charValue = new int[length];
        for (int i = 0; i < length; i++) {
            increasal /= 26;
            while(current + increasal <= n) {
                current += increasal;
                charValue[i]++;
            }
        }
        char[] seq = new char[length];
        for (int i = 0; i < length; i++) {
            seq[i] = (char) ('a' + charValue[i]);
        }
        out.println(new String(seq));
        out.close();
    }
}
