import java.util.Scanner;

class Main {
    private static int rec(String src, String dst, String[][] ab) {
        int result = -1;
        if (src.equals(dst)) {
            result = 0;
        } else if (src.length() >= dst.length()) {
            result = -1;
        } else {
            for (int i = 0; i < ab.length; i++) {
                if (src.indexOf(ab[i][0]) != -1) {
                    int r = rec(src.replaceAll(ab[i][0], ab[i][1]), dst, ab);
                    if (r != -1) {
                        r++;
                    }
                    if (result < 0 || (r > 0 && r < result)) {
                        result = r;
                    }
                }
            }
        }
        return result;
    }

    private static void solve() {
        final Scanner scanner = new Scanner(System.in);
        while (true) {
            final int n = scanner.nextInt();
            if (n == 0) {
                break;
            }
            String[][] ab = new String[n][2];
            for (int i = 0; i < n; i++) {
                ab[i][0] = scanner.next();
                ab[i][1] = scanner.next();
            }
            final String src = scanner.next();
            final String dst = scanner.next();
            System.out.println(rec(src, dst, ab));
        }
    }

    public static void main(String... args) {
        solve();
    }
}