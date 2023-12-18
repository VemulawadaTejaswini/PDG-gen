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
        int answer = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            int x = 0;
            int a = scan.nextInt();
            while (a % 2 == 0) {
                x += 1;
                a /= 2;
            }
            answer = Math.min(answer, x);
        }
        System.out.println(answer);
    }
}
