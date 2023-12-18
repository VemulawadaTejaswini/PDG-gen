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
        long ans = 0;
        long[] list = new long[N];
        int last = N - 1;
        int first = 0;
        if (N % 2 == 0) {
            for (int i = 0; i < N / 2; i++) {
                list[N / 2 - 1 - i] = i % 2 == 0 ? A[first++] : A[last--];
                list[N / 2 + i] = i % 2 == 0 ? A[last--] : A[first++];
            }
        } else {
            list[N / 2] = A[first++];
            for (int i = 0; i < N / 2; i++) {
                list[N / 2 - i - 1] = i % 2 == 0 ? A[last--] : A[first++];
                list[N / 2 + i + 1] = i % 2 == 0 ? A[last--] : A[first++];
            }
        }
        for (int i = 0; i < N - 1; i++) {
            ans += Math.abs(list[i]-list[i+1]);
        }
        System.out.println(ans);
    }
}
