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
        int K = scan.nextInt();
        long[] H = new long[N];
        for (int i = 0; i < N; i++) {
            H[i] = scan.nextInt();
        }
        Arrays.sort(H);
        for (int i = 0; i < K; i++) {
            if (N-1-i < 0) {
                break;
            }
            H[N-1-i] = 0;
        }
        long answer = Arrays.stream(H).sum();
        System.out.println(answer);
    }
}
