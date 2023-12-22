import java.util.*;
public class Peaks {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt(), M = in.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = in.nextInt();
        }
        boolean[] good = new boolean[N];
        for (int i = 0; i < N; i++) {
            good[i] = true;
        }
        for (int i = 0; i < M; i++) {
            int u = in.nextInt() - 1, v = in.nextInt() - 1;
            if (arr[u] <= arr[v]) {
                good[u] = false;
            }
            if (arr[u] >= arr[v]) {
                good[v] = false;
            }
        }
        int res = 0;
        for (boolean b : good) {
            if (b) {
                res++;
            }
        }
        System.out.println(res);
    }
}
