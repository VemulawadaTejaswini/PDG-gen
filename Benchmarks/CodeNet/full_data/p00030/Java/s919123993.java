import java.io.BufferedInputStream;
import java.io.PrintStream;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedInputStream(System.in));
        PrintStream out = System.out;
        try {
            while (true) {
                solve(in, out);
            }
        } catch (NoSuchElementException e) {
            return;
        }
    }
    private static void solve(Scanner in, PrintStream out) {
        int n = in.nextInt(), s = in.nextInt();
        if (n == 0 && s == 0) {
            throw new NoSuchElementException();
        }
        out.println(dfs(n, s, 0));
    }
    private static int dfs(int n, int s, int from) {
        if (n == 0 && s == 0) {
            return 1;
        }
        if (n == 0 || s <= 0 || from > 9) {
            return 0;
        }
        int ans = 0;
        for (int i = from; i <= 9; i++) {
            ans += dfs(n - 1, s - i,i + 1);
        }
        return ans;
    }
}
