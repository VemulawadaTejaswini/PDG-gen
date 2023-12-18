import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {
    public void solve(BufferedReader stdin, PrintWriter stdout) throws NumberFormatException, IOException {
        String a = stdin.readLine();

        int[] c = new int[26];
        for (char ch : a.toCharArray()) {
            c[ch - 'a']++;
        }

        int ans = a.length() * (a.length() - 1) / 2 + 1;
        for (int v : c) {
            ans -= v * (v - 1) / 2;
        }
        stdout.println(ans);
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter stdout = new PrintWriter(System.out, false);
        new Main().solve(stdin, stdout);
        stdout.flush();
    }
}