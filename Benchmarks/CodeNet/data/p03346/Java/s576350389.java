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
        int[] P = new int[N];
        for (int i = 0; i < N; i++) {
            P[i] = scan.nextInt();
        }
        int current = P[0];
        int count_from_first = 1;
        for (int i = 1; i < N; i++) {
            if (current + 1 == P[i]) {
                count_from_first += 1;
                current = P[i];
            }
        }
        current = P[N-1];
        int count_from_last = 1;
        for (int i = N-2; 0 <= i; i--) {
            if (current - 1 == P[i]) {
                count_from_last += 1;
                current = P[i];
            }
        }
        int answer = N - Math.max(count_from_first, count_from_last);
        System.out.println(answer);
    }
}
