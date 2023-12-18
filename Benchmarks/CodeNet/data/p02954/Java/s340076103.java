import java.util.Scanner;

public class Main {
    private static StringBuilder sb;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sb = new StringBuilder(s.length() * 3);
        int rc = 0;
        int lc = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'R') {
                if (lc == 0) {
                    rc++;
                } else {
                    exec(rc, lc);
                    rc = 1;
                    lc = 0;
                }
            } else {
                lc++;
            }
        }
        exec(rc, lc);
        System.out.println(sb.substring(0, sb.length() -1));
    }
    private static void exec(int rc, int lc) {
        int sum = rc + lc;
        int half = sum / 2;
        if (sum % 2 == 0) {
            for(int i = 0; i < rc - 1; i++) {
                sb.append('0').append(' ');
            }
            sb.append(half).append(' ').append(half).append(' ');
            for(int i = 0; i < lc - 1; i++) {
                sb.append('0').append(' ');
            }
        } else {
            int rh = half;
            int lh = half;
            if (rc % 2 == 0) {
                lh += 1;
            } else {
                rh += 1;
            }
            for(int i = 0; i < rc - 1; i++) {
                sb.append('0').append(' ');
            }
            sb.append(rh).append(' ').append(lh).append(' ');
            for(int i = 0; i < lc - 1; i++) {
                sb.append('0').append(' ');
            }
        }
    }
}
