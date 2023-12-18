import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        String S = scan.next();
        int ans = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    String match = String.format("[0-9]*%d[0-9]*%d[0-9]*%d[0-9]*", i, j, k);
                    if (S.matches(match)) {
                        ans += 1;
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
