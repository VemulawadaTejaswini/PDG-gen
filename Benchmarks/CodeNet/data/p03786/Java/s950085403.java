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
        long[] A = new long[N];
        for (int i = 0; i < N; i++) {
            A[i] = scan.nextLong();
        }
        Arrays.sort(A);
        long[] sum = new long[N+1];
        sum[0] = 0;
        for(int i = 1; i <= N; i++) {
            sum[i] = sum[i-1] + A[i-1];
        }
        int answer = 1;
        for (int i = 2; i <= N; i++) {
            if (sum[i-1]*2 < A[i-1]) {
                answer = 1;
                continue;
            }
            answer += 1;
        }
        System.out.println(answer);
    }
}
