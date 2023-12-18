import java.util.Scanner;

/**
 * C
 */
public class Main {
    static int len;
    static long ans = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.nextLine();
        len = S.length();
        calc(S, "");

        System.out.println(ans);
        sc.close();
    }
    
    static void calc(String s, String rest) {
        long n1 = Long.parseLong(s);
        long n2 = 0;
        if (rest.length() != 0) {
            n2 = Long.parseLong(rest);
        }
        
        ans += n1 + n2;
        ans += (Math.pow(2, s.length() - 1) - 1) * n2;

        for (int i = 1; i < s.length(); i++) {
            calc(s.substring(0, i), s.substring(i, s.length()));
        }
    }
}