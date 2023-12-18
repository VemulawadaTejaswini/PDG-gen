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
        long answer = 0;
        for (int i = 1; i <= N; i++) {
            String x = Integer.toString(i);
            int t = 0;
            for (char c : x.toCharArray()) {
                t += c - '0';
            }
            if (A <= t && t <= B) {
                answer += i;
            }
        }
        System.out.println(answer);
    }
}
