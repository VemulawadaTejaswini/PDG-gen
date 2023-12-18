import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
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
        long[] B = new long[N];
        long[] C = new long[N];
        for (int i = 0; i < N; i++) {
            A[i] = scan.nextLong();
        }
        for (int i = 0; i < N; i++) {
            B[i] = scan.nextLong();
        }
        for (int i = 0; i < N; i++) {
            C[i] = scan.nextLong();
        }
        Arrays.sort(A);
        Arrays.sort(B);
        Arrays.sort(C);
        long answer = 0;
        for (int i = 0; i < N; i++) {
            int top = 0;
            int bottom = 0;
            int index1 = Arrays.binarySearch(A, B[i]);
            if (index1 < 0) {
                index1 = - index1 - 1;
            }
            if (N == index1) {
                index1 -= 1;
            }
            boolean found = false;
            for (top = index1; 0 <= top; top--) {
                if (A[top] < B[i]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                continue;
            }
            int index2 = Arrays.binarySearch(C, B[i]);
            if (index2 < 0) {
                index2 = - index2 - 1;
            }
            found = false;
            for (bottom = index2; bottom < N; bottom++) {
                if (B[i] < C[bottom]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                continue;
            }
            answer += (top + 1) * (N - bottom);
        }
        System.out.println(answer);
    }
}
