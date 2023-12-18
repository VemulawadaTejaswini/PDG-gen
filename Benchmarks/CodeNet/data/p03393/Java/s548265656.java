public class Main {
    private static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        String s = scanner.next();
        if (s.equals("zyxwvutsrqponmlkjihgfedcba")) {
            System.out.println(-1);
        } else if (s.length() < 26) {
            for (char c = 'a'; c <= 'z'; c++) {
                if (s.indexOf(c) == -1) {
                    System.out.println(s + c);
                    return;
                }
            }
        } else {
            char[] c = s.toCharArray();
            char last = c[25], use = c[25];

            for (int i = c.length - 2; i >= 0; i--) {
                Util.println(last, use, c[i]);
                if (last < c[i]) {
                    use = (char)Math.min(use, last = c[i]);
                } else {
                    System.out.println(s.substring(0, i) + use);
                    return;
                }
            }
        }
    }
}