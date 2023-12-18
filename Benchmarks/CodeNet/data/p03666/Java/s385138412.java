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
        long A = scan.nextLong();
        long B = scan.nextLong();
        long C = scan.nextLong();
        long D = scan.nextLong();
        boolean found = false;
        for (int i = 0; i <= N; i++) {
            long min = A + i * C - (N - i) * D;
            long max = A + i * D - (N - i) * C;
            if (min <= B && B <= max) {
                found = true;
                break;
            }
        }
        System.out.println(found?"YES":"NO");
    }
}
