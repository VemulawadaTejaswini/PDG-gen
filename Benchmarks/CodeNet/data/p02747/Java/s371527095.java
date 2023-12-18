import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
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
        int i = 0;
        if (d.length % 2 != 0) {
            System.out.println("No");
            return;
        }
        while (i < d.length - 1) {
            if (d[i] == 'h' && d[i+1] == 'i') {
                i += 2;
                continue;
            }
            System.out.println("No");
            return;
        }
        System.out.println("Yes");
    }
}
