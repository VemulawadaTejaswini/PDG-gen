import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        for (int i = s.length() - t.length(); i >= 0; i--) {
            String ss = s.substring(i, i + t.length());
            if (check(ss, t)) {
                char[] c = s.toCharArray();
                for (int j = 0; j < c.length; j++) {
                    if (c[j] == '?') {
                        if (j >= i && j < i + t.length()) {
                            c[j] = t.charAt(j - i);
                        } else {
                            c[j] = 'a';
                        }
                    }
                }
                s = new String(c);
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
