import java.util.*;

public class Main {

    long INF = Long.MAX_VALUE;

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String T = sc.next();
        char[] s = S.toCharArray();
        char[] t = T.toCharArray();
        int[] R = new int[27];
        int[] R2 = new int[27];
        Arrays.fill(R, -1);
        Arrays.fill(R2, -1);
        for (int i = 0; i < S.length(); i++) {
            if (R[s[i] - 'a'] >= 0) {
                if (R[s[i] - 'a'] != (t[i] - 'a')) {
                    System.out.println("No");
                    return;
                }
            } else {
                R[s[i] - 'a'] = t[i] - 'a';
            }
            if (R2[t[i] - 'a'] >= 0) {
                if (R2[t[i] - 'a'] != (s[i] - 'a')) {
                    System.out.println("No");
                    return;
                }
            } else {
                R2[t[i] - 'a'] = s[i] - 'a';
            }
        }
        System.out.println("Yes");
    }
}
