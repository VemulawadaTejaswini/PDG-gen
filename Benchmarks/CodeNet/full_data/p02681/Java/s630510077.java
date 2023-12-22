import java.util.Scanner;

public class Main {

    static boolean test(String s, String t) {
        if (t.length() != s.length() + 1) {
            return false;
        }
        for (int i=0;i<s.length();i++) {
            if (s.charAt(i) != t.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next(), t = in.next();
        System.out.println(test(s, t) ? "Yes" : "No");
    }
}
