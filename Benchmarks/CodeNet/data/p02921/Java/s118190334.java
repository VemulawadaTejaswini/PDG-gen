import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        String S = scan.next();
        String T = scan.next();
        char[] d_s = S.toCharArray();
        char[] d_t = T.toCharArray();
        int answer = 0;
        for (int i = 0; i < 3; i++) {
            if (d_s[i] == d_t[i]) {
                answer += 1;
            }
        }

        System.out.println(answer);
    }
}
