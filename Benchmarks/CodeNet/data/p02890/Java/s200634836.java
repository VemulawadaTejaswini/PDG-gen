import java.io.*;
import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int N = sc.nextInt();
        int[] count = new int[N];
        for (int i = 0; i < N; i++) {
            count[sc.nextInt() - 1]++;
        }
        int[] hist = new int[N + 1];
        for (int i = 0; i < N; i++) {
            hist[count[i]]++;
        }
        long[] used = new long[N + 1];
        int lack = 0;
        for (int i = 1; i <= N; i++) {
            lack += hist[i - 1];
            used[i] = used[i - 1] + lack;
        }
        int[] ans = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            ans[i] = N - (int) ((used[i] + i - 1) / i);
        }
        int[] out = new int[N + 1];
        for (int i = 1; i < N; i++) {
            for (int j = ans[i]; j > ans[i + 1]; j--) {
                out[j] = i;
            }
        }
        out[1] = N;
        PrintWriter writer = new PrintWriter(System.out);
        for (int i = 0; i < N; i++) {
            writer.println(out[i + 1]);
        }
        writer.flush();
    }
}
