import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            String S2 = in.next();
            String T = in.next();

            boolean match = false;
            String minS = "Z";
            String S = "";
            for (int i = 0; i < S2.length(); i++) {
                if (match(S2, i, T)) {
                    match = true;
                    String S3 = S + T;
                    for (int j = S3.length(); j < S2.length(); j++) {
                        char charAt = S2.charAt(j);
                        if (charAt == '?') {
                            S3 += 'a';
                            continue;
                        }
                        S3 += charAt;
                    }

                    if (S3.compareTo(minS) < 0) {
                        minS = S3;
                    }
                    // i += T.length();
                    // i--;
                    // break;
                    // continue;
                }
                if (S2.charAt(i) == '?') {
                    S += 'a';
                } else {
                    S += S2.charAt(i);
                }
            }

            if (match) {
                System.out.println(minS);
            } else {
                System.out.println("UNRESTORABLE");
            }
        }
    }

    private static boolean match(String s2, int i, String t) {
        for (int k = 0; k < t.length(); k++) {
            if (i + k >= s2.length()) {
                return false;
            }

            if (s2.charAt(i + k) == t.charAt(k)) {

            } else if (s2.charAt(i + k) == '?') {

            } else {
                return false;
            }
        }
        return true;
    }
}
