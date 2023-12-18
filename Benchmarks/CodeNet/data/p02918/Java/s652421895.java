
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Iterator;

class Main {

    static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        final int K = sc.nextInt();
        String S = sc.next();
        char[] ch = S.toCharArray();
        boolean[] b = new boolean[N];
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            b[i] = ch[i] == 'L' ? true : false;
        }
        int ans = 0;
        do {
            // System.out.println(cnt + Arrays.toString(b));
            if (!(cnt < K))
                break;

            for (int i = 0; i < N - 3; i++) {
                if (b[i] && !b[i + 1] && b[i + 2]) {
                    b[i + 1] = !b[i + 1];
                    cnt++;
                }

                else if (!b[i] && b[i + 1] && !b[i + 2]) {
                    b[i + 1] = !b[i + 1];
                    cnt++;
                }

                if (!(cnt < K))
                    break;
            }

            
            if (!(cnt < K))
                break;
            if (b[0]) {
                cnt++;
                for (int i = 0; i < N && b[i]; i++) {
                    b[i] = !b[i];
                }
            }
            if (!(cnt < K))
                break;
            if (!b[N - 1]) {
                cnt++;
                for (int i = N - 1; i >= 0 && !b[i]; --i) {
                    b[i] = !b[i];
                }
            }
            // System.out.println(cnt + Arrays.toString(b));
        } while (false);
        // System.out.println(cnt + Arrays.toString(b));
        for (int i = 1; i < N; i++) {
            if (b[i] && b[i - 1])
                ans++;
            // System.out.println(ans);
        }
        for (int i = N - 2; i >= 0; --i) {
            if (!b[i] && !b[i + 1])
                ans++;
            // System.out.println(ans);
        }
        System.out.println(ans);
    }
}