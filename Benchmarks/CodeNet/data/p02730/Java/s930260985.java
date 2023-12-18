import java.util.*;

public class Main {
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);

        final String S = sc.next();
        sc.close();
        int len = S.length();

        if(!isPalindrome(S)){
            System.out.println("No");
            return;
        }

        String s1 = S.substring(0, (len - 1) / 2);
        String s2 = S.substring((len + 3) / 2 - 1);

        if(!isPalindrome(s1) || !isPalindrome(s2)){
            System.out.println("No");
            return;
        }

        System.out.println("Yes");
    }
    static boolean isPalindrome (String s) {
        int n = s.length();
        for (int i=0; i<n/2; i++) {
            if (s.charAt(i)!=s.charAt(n-i-1)) {return false;}
        }
        return true;
    }
}