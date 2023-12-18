import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        char[] s = S.toCharArray();
        int k = 0;
        for (int i = 0; i < 3; i++) {
            if (s[i] == 'o') {
                k++;
            }
        }
        System.out.println(700 + 100 * k);
    }
}
