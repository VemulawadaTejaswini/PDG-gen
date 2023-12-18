import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            set.add(s.charAt(i));
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i <= 'z' - 'a'; i++) {
            char c = (char) ('a' + i);
            if (!set.contains(c)) {
                continue;
            }

            StringBuilder sb = new StringBuilder(s);
            while (sb.length() >= 0) {
                int len = sb.length();
                boolean same = true;
                for (int k = 0; k < len; k++) {
                    if (sb.charAt(k) != c) {
                        same = false;
                        break;
                    }
                }
                if (same) {
                    min = Math.min(min, s.length() - len);
                    break;
                }

                for (int k = 1; k < len; k++) {
                    if (sb.charAt(k) == c) {
                        sb.setCharAt(k - 1, c);
                    }
                }
                sb.deleteCharAt(len - 1);
            }
        }
        System.out.println(min);
    }

}
