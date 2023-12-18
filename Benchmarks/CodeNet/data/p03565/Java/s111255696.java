import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        for (int i = 0; i <= s.length() - t.length(); i++) {
            String ss = s.substring(i, i + t.length());
            if (check(ss, t)) {
                s = s.replace(ss, t);
                if (s.indexOf('?') >= 0) {
                    char[] c = s.toCharArray();
                    for (int j = 0; j < c.length; j++) {
                        if (c[j] == '?') {
                            c[j] = 'a';
                        }
                    }
                    s = new String(c);
                }
                System.out.println(s);
                return;
            }
        }
        System.out.println("UNRESTORABLE");
    }

    static boolean check(String s, String t) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '?') {
                continue;
            }
            if (s.charAt(i) != t.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
