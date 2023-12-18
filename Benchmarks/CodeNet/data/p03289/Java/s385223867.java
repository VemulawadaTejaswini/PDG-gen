import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        char[] c = S.toCharArray();
        boolean ans1 = false;
        boolean ans2 = false;
        boolean ans3 = true;
        for (int i = 0; i < S.length(); i++) {
            if (i == 0 && c[i] == 'A') {
                ans1 = true;
                continue;
            }
            if (i >= 2 && ans2 == false && i <= S.length() - 2 && c[i] == 'C') {
                ans2 = true;
                continue;
            }
            if (Character.isUpperCase(c[i])) {
                ans3 = false;
            }
        }
        if (ans1 && ans2 && ans3) {
            System.out.println("AC");
        } else {
            System.out.println("WA");
        }

    }
}