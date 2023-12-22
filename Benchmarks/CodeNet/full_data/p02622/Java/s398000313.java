import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        char[] S = scan.next().toCharArray();
        char[] T = scan.next().toCharArray();
        int ans = 0;
        for (int i = 0; i < S.length; i++) {
            if (S[i] != T[i]) {
                ans += 1;
            }
        }
        System.out.println(ans);
    }
}
