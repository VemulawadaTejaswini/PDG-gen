import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
        char[] s = S.toCharArray();
        int ans = 0;
        int x = 0;
        for (int i = 0; i < N; i++) {
            if (s[i] == 'I') {
                x++;
            } else {
                x--;
            }
            ans = Math.max(x, ans);
        }
        System.out.println(ans);
    }
}