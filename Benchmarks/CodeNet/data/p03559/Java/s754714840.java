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
            int index = Arrays.binarySearch(B, A[i]);
            if (index < 0) {
                index = - index - 1;
            }
            if (N <= index) {
                continue;
            }
            for (int j = index; j < N; j++) {
                if (B[j] <= A[i])  {
                    continue;
                }
                int index2 = Arrays.binarySearch(C, B[j]);
                if (index2 < 0) {
                    index2 = - index2 - 1;
                }
                if (N <= index2) {
                    break;
                }
                for (int k = index2; k < N; k++) {
                    if (C[k] <= B[j]) {
                        continue;
                    }
                    answer += N - k;
                    break;
                }
            }
        }
        System.out.println(answer);
    }
}
