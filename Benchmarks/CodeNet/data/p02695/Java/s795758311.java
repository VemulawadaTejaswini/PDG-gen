
import java.util.Scanner;

public class Main {

    static int n;
    static int m;
    static int q;

    static int[] a;
    static int[] b;
    static int[] c;
    static int[] d;

    static int ans = 0;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        n = Integer.parseInt(scan.next());
        m = Integer.parseInt(scan.next());
        m--;
        q = Integer.parseInt(scan.next());
        a = new int[q];
        b = new int[q];
        c = new int[q];
        d = new int[q];
        for (int i = 0; i < q; i++) {
            a[i] = Integer.parseInt(scan.next());
            b[i] = Integer.parseInt(scan.next());
            c[i] = Integer.parseInt(scan.next());
            d[i] = Integer.parseInt(scan.next());
            a[i]--;
            b[i]--;
        }
        scan.close();

        dfs("0");

        System.out.println(ans);
    }

    private static void dfs(String s) {
        if (s.length() == n) {
            int score = 0;
            for (int i = 0; i < q; i++) {
                if (s.charAt(b[i]) - s.charAt(a[i]) == c[i]) {
                    score += d[i];
                }
            }
            ans = Math.max(ans, score);
            return;
        }

        String[] sArray = s.split("");
        int last = Integer.parseInt(sArray[s.length() - 1]);
        for (int i = last; i <= m; i++) {
            dfs(s + String.valueOf(i));
        }
    }

}
