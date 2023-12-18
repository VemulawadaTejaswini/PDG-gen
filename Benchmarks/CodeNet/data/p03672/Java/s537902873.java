import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        while (s.length() != 2) {
            s = s.substring(0, s.length() - 2);
            String s1 = s.substring(0, s.length() / 2 - 1);
            String s2 = s.substring(s.length() / 2, s.length() - 1);
            if (s1.equals(s2)) {
                System.out.println(s.length());
                System.exit(0);
            }
        }
        System.out.println(1);
    }
}
