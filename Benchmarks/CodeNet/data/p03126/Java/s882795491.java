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
        int[] counter = new int[M];
        for (int i = 0; i < N; i++) {
            int K = scan.nextInt();
            for (int j = 0; j < K; j++) {
                int a = scan.nextInt();
                counter[a-1] += 1;
            }
        }
        int answer = 0;
        for (int i = 0; i < M; i++) {
            if (counter[i] == N) {
                answer += 1;
            }
        }
        System.out.println(answer);
    }
}
