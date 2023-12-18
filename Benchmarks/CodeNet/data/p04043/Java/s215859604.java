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
        String A = scan.next();
        String B = scan.next();
        String C = scan.next();
        boolean answer = false;
        if (A.length() == 5 && B.length() == 7 && C.length() == 5) {
            answer = true;
        }
        System.out.println(answer ? "YES" : "NO");
    }
}
