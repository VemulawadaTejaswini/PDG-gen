import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        long K = sc.nextLong();
        sc.close();

        if (isAllSame(S)) {
            System.out.println(S.length() * K / 2);
            return;
        }
        if (S.charAt(0) != S.charAt(S.length()-1)) {
            System.out.println(NotContinue(S.charAt(0), S, K));
            return;
        }
        int FrontLength = getSameLength(S, S.charAt(0), 0, 1);
        int BackLength = getSameLength(S, S.charAt(S.length()-1), S.length()-1, -1);
        System.out.println(NotContinue(S.charAt(0), S, K) + ((FrontLength + BackLength) / 2 - (FrontLength / 2) - (BackLength / 2)) * (K - 1));
        return;   
    }
    public static boolean isAllSame(String S) {
        if (S.length() == getSameLength(S, S.charAt(0), 0, 1)) {
            return true;
        }
        return false;
    }
    public static int getSameLength(String S, char a, int index, int add) {
        if (index < 0 || index >= S.length()) {
            return 0;
        }
        if (S.charAt(index) == a) {
            return 1 + getSameLength(S, a, index + add, add);
        }
        return 0;
    }
    public static long NotContinue(char a, String S, long K) {
        if (S.length() < 2) {
            return 0;
        }
        if (S.charAt(0) == S.charAt(1)) {
            if (S.length() >= 3) {
                return K + NotContinue(a, GetDiffString(S.charAt(0), S.charAt(2)) + S.substring(2), K);
            }
            return K + NotContinue(a, GetDiffString(S.charAt(0), a) + S.substring(2), K);
        }
        return NotContinue(a, S.substring(1), K);
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

