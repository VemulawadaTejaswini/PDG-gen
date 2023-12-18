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
        int answer = 0;
        for (int i = 1; i <= N; i++) {
            if (i % 2 == 0) {
                continue;
            }
            int count = 0;
            for (int j = 1; j*2 <= i; j++) {
                if (i % j == 0) {
                    count += 1;
                }
            }
            if (count == 7) {
                answer += 1;
            }
        }
        System.out.println(answer);
    }
}
