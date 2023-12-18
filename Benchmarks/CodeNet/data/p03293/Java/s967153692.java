import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String T = sc.next();
        char[] s = S.toCharArray();
        char[] t = T.toCharArray();
        int l = 0;
        lavel:
        for (int i = 0; i < S.length(); i++) {
            for (int j = i; j < S.length(); j++, l++) {
                if (s[j] == t[l]) {
                } else {
                    continue lavel;
                }
                if (j == S.length() - 1 && i == 0) {
                    System.out.println("Yes");
                    return;
                }
            }
            for (int k = S.length() - i - 2; k < i; k++, l++) {
                if (s[k] == t[l]) {
                } else {
                    continue lavel;
                }
                if (l == S.length() - 1) {
                    System.out.println("Yes");
                    return;
                }
            }
        }
        System.out.println("No");
    }
}