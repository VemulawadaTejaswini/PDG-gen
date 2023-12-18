import java.util.*;

class Main {
    static String divide[] = {
        "dream",
        "dreamer",
        "erase",
        "eraser"
    };

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();

        boolean canDiv;
        while (true) {
            boolean isFit = false;
            for (String d: divide) {
                if (d.length() > S.length()) continue;
                String substr = S.substring(S.length() - d.length());
                if (d.equals(substr)) {
                    S = S.substring(0, S.length() - d.length());
                    isFit = true;
                    break;
                }
            }
            if (!isFit) {
                canDiv = false;
                break;
            }
            if (S.length() <= 0) {
                canDiv = true;
                break;
            }
            System.gc();
        }

        if (canDiv)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
