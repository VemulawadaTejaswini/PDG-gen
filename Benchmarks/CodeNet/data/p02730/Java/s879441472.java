package app;

import java.security.cert.CertPathValidatorException.BasicReason;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        sc.close();

        int N = S.length();
        String result = "";

        if (!isKaibun(S)) {
            result = "No";
        } else {
            int firstLength = (N - 1) / 2;
            if (firstLength < 0) {
                firstLength = 0;
            }
            String judge1 = S.substring(0, firstLength);
            if (!isKaibun(judge1)) {
                result = "No";
            } else {
                int secondLength = (N + 3) / 2;
                if (secondLength > N) {
                    secondLength = N - 1;
                }
                String judge2 = S.substring(secondLength, N - 1);
                if (!isKaibun(judge2)) {
                    result = "No";
                } else {
                    result = "Yes";
                }
            }
        }

        System.out.println(result);
    }

    public static boolean isKaibun(String s) {
        int length = s.length();
        for (int i = 0; i < s.length() / 2; i++) {
            int lastIndex = length - 1 - i;
            char sentou = s.charAt(i);
            char last = s.charAt(lastIndex);
            if (sentou != last) {
                return false;
            }
            if (i == lastIndex) {
                break;
            }
        }
        return true;
    }

}
