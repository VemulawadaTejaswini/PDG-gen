import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {
    public void solve(BufferedReader stdin, PrintWriter stdout) throws NumberFormatException, IOException {
        String s = stdin.readLine();
        long k = Long.parseLong(stdin.readLine());

        if (s.length() == 1) {
            stdout.println(1);
            return ;
        }

        long c = count(s + s);
        long d = count(s);

        if (k % 2 == 0) {
            stdout.println(c * (k / 2));
        } else {
            stdout.println(c * (k / 2) + d);
        }
    }

    private long count(String s) {
        char[] t = s.toCharArray();
        long c = 0;
        for (int i = 1; i < t.length; i++) {
            if (t[i - 1] == t[i]) {
                t[i] = '@';
                c++;
            }
        }
        return c;
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter stdout = new PrintWriter(System.out, false);
        new Main().solve(stdin, stdout);
        stdout.flush();
    }
}