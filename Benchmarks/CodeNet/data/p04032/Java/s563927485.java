import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if (s.length() == 2) {
            if (s.charAt(0) == s.charAt(1)) System.out.println(1 + " " + 2);
            else System.out.println(-1 + " " + -1);
            return;
        }
        for (int i = 0; i + 3 <= s.length(); i++) {
            String sub = s.substring(i, i + 3);
            if (check(sub)) {
                System.out.println((i + 1) + " " + (i + 3));
                return;
            }
        }
        System.out.println(-1 + " " + -1);
    }
    public static boolean check(String s) {
        if (s.charAt(0) == s.charAt(1)) return true;
        if (s.charAt(1) == s.charAt(2)) return true;
        if (s.charAt(2) == s.charAt(0)) return true;
        return false;
    }
}