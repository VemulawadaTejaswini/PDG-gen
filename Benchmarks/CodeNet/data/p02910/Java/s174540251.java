import java.util.Scanner;

public class Main {

    void solve() {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        char[] chars = S.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            char ch = chars[i];
            if ((i + 1) % 2 == 0) {
                if (ch == 'R') {
                    System.out.print("No");
                    return;
                }
            }
            else {
                if (ch == 'L') {
                    System.out.print("No");
                    return;
                }
            }
        }
        System.out.print("Yes");
    }

    // Main
    public static void main(String[] args) {
        new Main().solve();
    }
}