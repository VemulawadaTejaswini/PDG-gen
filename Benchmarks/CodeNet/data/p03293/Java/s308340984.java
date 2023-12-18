import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        if (s.equals(t)) {
            System.out.println("Yes");
        } else {
            for (int i = 0; i < s.length(); i++) {
                t = t.substring(t.length() - 1, t.length()) + t.substring(0, t.length() - 1);
                if (s.equals(t)) {
                    System.out.println("Yes");
                    System.exit(0);
                }
            }
            System.out.println("No");
        }
    }
}