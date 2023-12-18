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
        String s = scan.next();
        char[] d = s.toCharArray();
        int len = d.length;
        boolean all_nine = true;
        for (int i = 1; i < len; i++) {
            if (d[i] != '9') {
                all_nine = false;
                break;
            }
        }
        if (all_nine) {
            System.out.println(9 * (len - 1) + (d[0] - '0'));
            return;
        }
        System.out.println(9 * (len - 1) + (d[0] - '0') - 1);
        return;
    }
}
