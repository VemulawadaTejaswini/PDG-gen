import java.util.*;
import java.lang.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        if (s.length() < t.length()) {
            System.out.println("UNRESTORABLE");
        } else {
            int amari = s.length() - t.length();
            int clear = -1;
            for (int i = amari; i >= 0; i--) {
                boolean bre = false;
                for (int j = 0; j < t.length(); j++) {
                    if (s.charAt(j + i) != t.charAt(j) && s.charAt(j + i) != '?') {
                        bre = true;
                        break;
                    }
                }
                if (!bre) {
                    clear = i;
                    break;
                }
            }
            if (clear == -1) {
                System.out.println("UNRESTORABLE");
            } else {
                s = s.substring(0, clear) + t + s.substring(clear + t.length());
                s = s.replace('?', 'a');
                System.out.println(s);
            }
        }
    }
}