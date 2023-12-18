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
        boolean found = true;
        while (found) {
            long target = 0;
            found = false;
            for (int i = 0; i < N; i++) {
                if (target == 0) {
                    if (0 < A[i]) {
                        target = A[i];
                    }
                    continue;
                }
                A[i] = A[i] % target;
                found = true;
            }
            Arrays.sort(A);
        }
        long answer = 0;
        for (int i = 0; i < N; i++) {
            if (0 < A[i]) {
                answer = A[i];
                break;
            }
        }
        System.out.println(answer);
    }
}
