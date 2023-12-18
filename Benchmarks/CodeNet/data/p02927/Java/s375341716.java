import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Main main = new Main();
        main.solve();
    }
    public void solve() throws Exception {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int M = scan.nextInt();
        int D = scan.nextInt();
        int answer = 0;
        for (int i = 1; i <= M; i++) {
            for (int j = 1; j <= D; j++) {
                if (j < 20) {
                    continue;
                }
                int d10 = j / 10;
                int d1 = j % 10;
                if (d1 < 2) {
                    continue;
                }
                if (d10 * d1 == i) {
                    answer += 1;
                }
            }
        }
        System.out.println(answer);
    }
}
