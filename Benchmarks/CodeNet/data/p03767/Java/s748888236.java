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
        int[] A = new int[3 * N];
        for (int i = 0; i < N * 3; i++) {
            A[i] = scan.nextInt();
        }
        Arrays.sort(A);
        long answer = 0;
        for (int i = N; i < N * 3; i+=2) {
            answer += A[i];
        }
        System.out.println(answer);
    }
}
