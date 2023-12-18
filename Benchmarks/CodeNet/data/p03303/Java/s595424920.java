import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int w = sc.nextInt();
        char[] s = S.toCharArray();
        for (int i = 0; i < S.length(); i++) {
            if (i % w == 0) {
                System.out.print(s[i]);
            }
        }
        System.out.println();
    }
}