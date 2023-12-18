import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int K = sc.nextInt();
        sc.close();

        System.out.println(NotContinue(S.charAt(0), S) * K);
    }
    public static long NotContinue(char a, String S) {
        if (S.length() < 2) {
            if (S.charAt(0) == a) {
                return 1;
            }
            return 0;
        }
        if (S.charAt(0) == S.charAt(1)) {
            if (S.length() >= 3) {
                return 1 + NotContinue(a, GetDiffString(S.charAt(0), S.charAt(2)) + S.substring(2));
            }
            return 1 + NotContinue(a, GetDiffString(S.charAt(0), S.charAt(0)) + S.substring(2));
        }
        return NotContinue(a, S.substring(1));
    }
    public static String GetDiffString(char a, char b) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < alphabet.length(); i++) {
            if(a != alphabet.charAt(i) && b != alphabet.charAt(i)) {
                return alphabet.substring(i, i+1);
            }
        }
        return "a";
    }
}

