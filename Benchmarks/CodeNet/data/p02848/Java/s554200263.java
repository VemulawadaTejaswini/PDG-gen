import java.util.Arrays;
import java.util.Scanner;

public class Main {
    void run() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] s = sc.next().toLowerCase().toCharArray();
        char[] ans = new char[s.length];

        for (int i = 0; i < s.length; i ++) {
            ans[i] = (char) ((s[i] - 'a' + n) % 26 + 'a');
        }

        System.out.println(String.copyValueOf(ans).toUpperCase());
    }

    void debug(Object... os) {
        System.err.println(Arrays.deepToString(os));
    }

    public static void main(String[] args) {
        new Main().run();
    }
}
