import java.util.*;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();

        long ans = 0;
        for (int i = 0; i < 1 << S.length() - 1; i++) {
            int start = 0;
            for (int j = 0; j < S.length() - 1; j++) {
                if (((i >> j) & 1) == 1) {
                    String num = S.substring(start, j + 1);
                    ans += Long.parseLong(num);
                    start = j + 1;
                }
            }
            String num = S.substring(start, S.length());
            ans += Long.parseLong(num);
        }

        out.println(ans);
    }
}