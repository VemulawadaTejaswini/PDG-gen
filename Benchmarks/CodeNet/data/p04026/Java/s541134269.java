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
        String S = scan.next();
        char[] d = S.toCharArray();
        for (int i = 0; i < d.length - 1; i++) {
            if (d[i] == d[i+1]) {
                System.out.printf("%d %d\n", i+1, i+2);
                return;
            }
        }
        for (int i = 0; i < d.length - 2; i++) {
            if (d[i] == d[i+2]) {
                System.out.printf("%d %d\n", i+1, i+3);
                return;
            }
        }
        System.out.printf("%d %d\n", -1, -1);
    }
}
