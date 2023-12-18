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
        long N = scan.nextLong();
        long limit = 0;
        for (long i = 1; i <= N; i++) {
            if (i * (i + 1) < N * 2) {
                limit = i;
                continue;
            }
            break;
        }
        limit += 1;
        long remain = limit * (limit + 1) / 2 - N;
        for (int i = 1; i <= limit; i++) {
            if (i == remain) {
                continue;
            }
            System.out.println(i);
        }
    }
}
