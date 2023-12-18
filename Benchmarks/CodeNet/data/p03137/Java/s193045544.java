import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt(), M = in.nextInt();
        int[] X = new int[M];
        for (int i = 0; i < M; i++) {
            X[i] = in.nextInt();
        }
        Arrays.sort(X);
        int[] d = new int[M - 1];
        for (int i = 1; i < M; i++) {
            d[i - 1] = X[i] - X[i - 1];
        }
        Arrays.sort(d);
        int ans = 0;
        for (int i = 0; i < M - N; i++) {
            ans += d[i];
        }
        System.out.println(ans);
    }
}