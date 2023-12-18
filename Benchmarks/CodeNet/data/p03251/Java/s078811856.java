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
        int M = scan.nextInt();
        int X = scan.nextInt();
        int Y = scan.nextInt();
        int max_x = Integer.MIN_VALUE;
        for (int i = 0; i < N; i++) {
            int x = scan.nextInt();
            if (max_x < x) {
                max_x = x;
            }
        }
        int min_y = Integer.MAX_VALUE;
        for (int i = 0; i < M; i++) {
            int y = scan.nextInt();
            if (y < min_y) {
                min_y = y;
            }
        }
        boolean answer = false;
        for (int Z = X + 1; Z <= Y; Z++) {
            if (max_x < Z && Z <= min_y) {
                answer = true;
                break;
            }
        }
        System.out.println(answer ? "No War" : "War");
    }
}
