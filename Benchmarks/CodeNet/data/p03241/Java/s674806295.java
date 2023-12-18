import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        long N = scan.nextLong();
        long M = scan.nextLong();
        if (N == 1) {
            System.out.println(M);
            return;
        }
        long answer = 1;
        for (long i = 2; i * i <= M; i++) {
            if (M % i != 0) {
                continue;
            }
            long x = M - i * (N - 1);
            if (x % i == 0) {
                answer = Math.max(answer, i);
            }
        }
        System.out.println(answer);
    }
}
