

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
        int inx = s.indexOf(key);
        if (inx == 0) {
            System.out.println("YES");
            return;
        }
        if (key.equals(s.substring(s.length() - key.length()))) {
            System.out.println("YES");
            return;
        }
        for (int i = 1; i < key.length(); ++i) {
            String left = key.substring(0, i);
            String right = key.substring(i);
            int index = s.indexOf(left);
            if (index == 0) {
                int index2 = s.indexOf(right, index + left.length());
             //   System.out.println("index2: " + index2);
                if (index2 >= index + left.length() && index2 + right.length() == s.length()) {
                    System.out.println("YES");
                    return;
                }
            }
        }
        System.out.println("NO");
    }
}
