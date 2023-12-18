import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        long A = scan.nextLong();
        long B = scan.nextLong();
        long C = scan.nextLong();
        if (A % 2 == 0 || B % 2 == 0 || C % 2 == 0) {
            System.out.println(0);
            return;
        }
        long answer = A * B;
        answer = Math.min(answer, B * C);
        answer = Math.min(answer, C * A);
        System.out.println(answer);
    }
}
