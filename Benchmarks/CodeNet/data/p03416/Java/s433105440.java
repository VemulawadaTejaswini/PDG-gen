import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int A = in.nextInt();
            int B = in.nextInt();

            int count = 0;
            for (int i = A; i <= B; i++) {
                if (isPalindrome("" + i)) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }

    private static boolean isPalindrome(String s) {
        for (int l = 0, r = s.length() - 1; l < r; l++, r--) {
            if (s.charAt(l) != s.charAt(r)) {
                return false;
            }
        }
        return true;
    }
}
