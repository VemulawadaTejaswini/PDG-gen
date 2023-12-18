import java.util.*;
import java.lang.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if (s.length() != 26) {
            int a[] = new int[26];
            for (int i = 0; i < s.length(); i++) {
                a[s.charAt(i) - 'a'] = 1;
            }
            for (int i = 0; i < 26; i++) {
                if (a[i] == 0) {
                    char tmp = (char) ('a' + i);
                    System.out.println(s + tmp);
                    break;
                }
            }
        } else {
            boolean bre = false;
            for (int i = s.length() - 1; i > 0; i--) {
                if (s.charAt(i) - s.charAt(i - 1) > 0) {
                    System.out.println(s.substring(0, i - 1) + s.charAt(s.length() - 1));
                    bre = true;
                    break;
                }
            }
            if (!bre) {
                System.out.println(-1);
            }
        }
    }
}
