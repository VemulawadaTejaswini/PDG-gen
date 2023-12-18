import java.util.*;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();

        boolean[] exists = new boolean['z' - 'a' + 1];
        for (int i = 0; i < S.length(); i++) {
            exists[S.charAt(i) - 'a'] = true;
        }

        if (S.length() < 26) {
            out.print(S);
            for (int i = 0; i <= 'z' - 'a'; i++) {
                if (!exists[i]) {
                    out.println((char) ('a' + i));
                    return;
                }
            }
        } else {
            for (int i = S.length() - 2; i >= 0; i--) {
                if (S.charAt(i) < S.charAt(S.length() - 1)) {
                    for (int j = 0; j < S.length(); j++) {
                        if (j == i) {
                            out.print(S.charAt(S.length() - 1));
                            break;
                        } else {
                            out.print(S.charAt(j));
                        }
                    }
                    out.println();
                    return;
                }
            }
            out.println(-1);
        }
    }
}