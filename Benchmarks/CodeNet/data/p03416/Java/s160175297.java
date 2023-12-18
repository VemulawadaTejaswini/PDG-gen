import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int count = 0;
        for (int i = a; i <= b; i++) {
            if (isPalindromeNumber(i)) {
                count++;
            }
        }
        System.out.println(count);
    }

    static boolean isPalindromeNumber(int x) {
        String s = Integer.toString(x);
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}