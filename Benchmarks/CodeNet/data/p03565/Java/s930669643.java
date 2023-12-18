import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            String S2 = in.next();
            String T = in.next();

            Utils.debug(S2, T);

            boolean match = false;
            String minS = ""+(char)(1+(int)'z');
            String S = "";
            for (int i = 0; i < S2.length(); i++) {
                Utils.debug("match(S2, " + i + ", T)", match(S2, i, T));
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

                    Utils.debug("S3", S3);

                    if (S3.compareTo(minS) < 0) {
                        minS = S3;
                        Utils.debug("minS", minS);
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
                Utils.debug("S", S);
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

final class Utils {
    private Utils() {
    }

    public static final void debug(Object... o) {
        System.err.println(toString(o));
    }

    public static final String toString(Object... o) {
        return Arrays.deepToString(o);
    }

}
