
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    char[] cs;
    int[] cnt = new int[3];
    int n;
    public static void main(String[] args) {
        Main m = new Main();
        m.read();
        m.solve();
    }

    private void read() {
        Scanner sc = new Scanner(System.in);
        cs = sc.nextLine().toCharArray();
        n = cs.length;
        for (char c: cs)
            cnt[c - 'a']++;
    }

    private void solve() {
        int mx = 0, mn = 0;
        mn = Arrays.stream(cnt).min().getAsInt();
        mx = Arrays.stream(cnt).max().getAsInt();
        if (mx - mn == 1)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
