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
        String T = scan.next();
        char[] d = T.toCharArray();
        int len = d.length;
        for (int i = 0; i < len; i++) {
            if (d[i] == '?') {
                d[i] = 'D';
            }
        }
        System.out.println(String.valueOf(d));
    }
}
