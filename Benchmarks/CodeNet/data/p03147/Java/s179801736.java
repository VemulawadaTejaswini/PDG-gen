import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
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
        int current = 0;
        for (int i = 0; i < N; i++) {
            int h = scan.nextInt();
            if (current <= h) {
                answer += (h - current);
            }
            current = h;
        }
        System.out.println(answer);
    }
}
