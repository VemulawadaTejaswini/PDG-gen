

import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        String key = "keyence";
        if (s.length() < key.length()) {
            System.out.println("NO");
            return;
        }
        if (s.equals(key)) {
            System.out.println("YES");
            return;
        }
        if (s.indexOf(key, 0) >= 0) {
            System.out.println("YES");
            return;
        }
        if (s.indexOf(key, s.length() - key.length()) >= 0) {
            System.out.println("YES");
            return;
        }
        for (int i = 1; i <= key.length(); ++i) {
            String left = key.substring(0, i);
            String right = key.substring(i);
            int index = s.indexOf(left);
            if (index >= 0 && index + left.length() < s.length()) {
                int index2 = s.indexOf(right, index + left.length());
                if (index2 >= index + left.length() && index2 + right.length() == s.length()) {
                    System.out.println("YES");
                    return;
                }
            }
        }
        System.out.println("NO");
    }
}
