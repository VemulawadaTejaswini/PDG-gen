import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner sc;

    public Main() {
    }

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        new Main().solve();

    }

    private void solve() {
        String S = sc.next();
        String ans = "None";
        for (int i = 0; i < 26; i++) {
            if (S.indexOf((char)('a' + i)) == -1) {
                ans = "" + (char)('a' + i);
                break;
            } else {

            }
        }
        System.out.println(ans);
    }
}
