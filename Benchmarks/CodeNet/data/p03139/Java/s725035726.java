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
        int N = scan.nextInt();
        int A = scan.nextInt();
        int B = scan.nextInt();
        int max = Math.min(A,B);
        int min = (A + B <= N) ? 0 : (A+B)-N;
        System.out.printf("%d %d\n", max, min);
    }
}
