import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        if (!isKaibun(s)) {
            System.out.println("No");
            return;
        }
        if (!isKaibun(s.substring(0,(s.length()-1)/2))) {
            System.out.println("No");
            return;
        }
        if (!isKaibun(s.substring((s.length()+3)/2-1))) {
            System.out.println("No");
            return;
        }
        System.out.println("Yes");
    }

    public static boolean isKaibun(String s) {
        int n = s.length();
        for (int i = 0; i < n / 2; i++) {
            if (s.charAt(i) != s.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }
}