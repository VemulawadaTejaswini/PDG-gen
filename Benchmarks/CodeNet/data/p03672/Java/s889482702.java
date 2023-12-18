import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            String S = in.next();
            int L = S.length();
            for (int i = 1; i < L; i++) {
                String sub = S.substring(0, L - 1 - i);
                if (is(sub)) {
                    System.out.println(sub.length());
                    return;
                }
            }
        }
    }

    private static boolean is(String sub) {
        int L = sub.length();
        if (L % 2 == 1) {
            return false;
        }
        int L2 = L / 2;
        for (int i = 0; i < L2; i++) {
            if (sub.charAt(i) != sub.charAt(L2 + i)) {
                return false;
            }
        }
        return true;
    }
}
