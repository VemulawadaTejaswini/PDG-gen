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
        if (S.equals("RRR")) {
            System.out.println(3);
            return;
        }
        if (0 <= S.indexOf("RR")) {
            System.out.println(2);
            return;
        }
        if (0 <= S.indexOf("R")) {
            System.out.println(1);
            return;
        }
        System.out.println(0);
    }
}
