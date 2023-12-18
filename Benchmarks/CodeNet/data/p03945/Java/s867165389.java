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
        int countB = 0;
        int countW = 0;
        char prev = ' ';
        for (int i = 0; i < d.length; i++) {
            if (prev == d[i]) {
                continue;
            }
            prev = d[i];
            if (prev == 'W') {
                countW += 1;
            }
            if (prev == 'B') {
                countB += 1;
            }
        }
        System.out.println(countB + countW - 1);
    }
}
