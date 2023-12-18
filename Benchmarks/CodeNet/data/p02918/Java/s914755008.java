import java.io.*;
import java.util.*;

class Main {

    public static void main(String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        long N;
        N = sc.nextLong();
        long K;
        K = sc.nextLong();
        String S;
        S = sc.next();
        solve(N, K, S);
    }

    static void solve(long N, long K, String S) {
        long group = 0;
        long happy = 0;
        char ex = 'N';
        for (char c : S.toCharArray()) {
            if (ex != c) {
                group++;
            } else {
                happy++;
            }
            ex = c;
        }

        long ans;
        if (2 * K < group) {
            ans = happy + 2 * K;
        } else {
            ans = N - 1;
        }
        System.out.println(ans);
    }
}
