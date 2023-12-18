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
        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = scan.nextInt();
        boolean answer = false;
        if (A == 5 && B == 7 && C == 5) {
            answer = true;
        }
        System.out.println(answer ? "YES" : "NO");
    }
}
