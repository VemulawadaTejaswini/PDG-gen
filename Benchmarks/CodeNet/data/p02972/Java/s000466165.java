import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scan.nextInt();
        }
        int limit = 1;
        while (limit * 2 <= N) {
            limit += 1;
        }
        int[] answer = new int[N];
        int[] s = new int[limit];
        for (int i = limit; i <= N; i++) {
            answer[i-1] = A[i-1];
            for (int j = 1; j <= limit-1; j++) {
                if (i % j == 0) {
                    s[j] += A[i-1];
                }
            }
        }
        for (int i = limit - 1; 1 <= i; i--) {
            int x;
            if (A[i-1] == 0) {
                if (s[i] % 2 == 0) {
                    x = 0;
                } else {
                    x = 1;
                }
            } else {
                if (s[i] % 2 == 0) {
                    x = 1;
                } else {
                    x = 0;
                }
            }
            answer[i-1] = x;
            for (int j = i-1; 1 <= j; j--) {
                if (i % j == 0) {
                    s[j] += x;
                }
            }
        }
        int M = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= N; i++) {
            int t = answer[i-1];
            if (0 < t) {
                M += 1;
                sb.append(i + " ");
            }
        }
        System.out.println(M);
        if (0 < M) {
            System.out.println(sb.substring(0, sb.length() - 1));
        }
    }
}
