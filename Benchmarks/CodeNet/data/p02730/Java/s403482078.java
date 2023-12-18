import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // ABC159B - String Palindrome

        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        int len = s.length();

        boolean isOk = check(s);

        boolean isOk2 = check(s.substring(0, ((len - 1) / 2)));

        boolean isOk3 = check(s.substring((((len + 3) / 2) - 1), len));

        System.out.println((isOk && isOk2 && isOk3) ? "Yes": "No");
    }

    static boolean check(String s) {
        
        boolean isKai = true;

        int len = s.length();

        int half = len / 2;

        char[] c = s.toCharArray();

        for (int i = 0; i < half; i++) {
            if (c[i] != c[len - 1 - i]) {
                isKai = false;
                break;
            }
        }

        return isKai;
    }
}