import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String s = sc.next();
        int n = s.length();
        if(!isPalindrome(s)) {
            System.out.println("No");
        } else if(!isPalindrome(s.substring(0, (n - 1) / 2))) {
            System.out.println("No");
        } else if(!isPalindrome(s.substring((n + 3) / 2 - 1, n))) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }

    static boolean isPalindrome(String s) {
        for(int i = 0, f = s.length(); i < f; ++i) {
            if(s.charAt(i) != s.charAt(f - 1 - i)) {
                return false;
            }
        }

        return true;
    }
}