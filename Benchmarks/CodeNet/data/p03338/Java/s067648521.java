import java.util.*;

public class Main {

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
        int ans = 0;
        for (int i = 1; i < N; i++) {
            int C = 0;
            String S1 = S.substring(0, i + 1);
            String S2 = S.substring(i + 1, N);
            for (char c = 'a'; c <= 'z'; c++) {
                if (S1.contains(String.valueOf(c))&&S2.contains(String.valueOf(c))) {
                    C++;
                }
            }
            ans=Math.max(C,ans);
        }
        System.out.println(ans);
    }
}
