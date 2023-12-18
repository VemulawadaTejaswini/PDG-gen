import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String S = scan.next();
        System.out.println(solve(S));
    }
    private static String solve(String S) {
        char[] list = S.toCharArray();
        int[] use_chars = new int[26];
        for (int i = list.length - 1; 0 <= i; i--) {
            use_chars[(int)list[i]-97] += 1;
        }
        if(list.length < 26) {
            for(int i = 0; i < 26; i++) {
                if(use_chars[i] == 0) {
                    return S + (char) (i+97);
                }
            }
        }
        for (int i = list.length - 1; 0 <= i; i--) {
            int current = list[i] - 97;
            for(int j = current + 1; j < 26; j++) {
                if(use_chars[j] == 0) {
                    return S.substring(0, i) + (char) (j+97);
                }
            }
            use_chars[current] -= 1;
        }
        return "-1";

    }

}
