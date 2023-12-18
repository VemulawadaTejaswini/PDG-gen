import java.util.*;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();

        int zeroStart = 0;
        for (int i = 0; i < S.length(); i++) {
            if (i % 2 == 0) {
                if (S.charAt(i) != '0') {
                    zeroStart++;
                }
            } else {
                if (S.charAt(i) != '1') {
                    zeroStart++;
                }
            }
        }

        int oneStart = 0;
        for (int i = 0; i < S.length(); i++) {
            if (i % 2 == 0) {
                if (S.charAt(i) != '1') {
                    oneStart++;
                }
            } else {
                if (S.charAt(i) != '0') {
                    oneStart++;
                }
            }
        }

        out.print(Math.min(oneStart, zeroStart));
    }
}
