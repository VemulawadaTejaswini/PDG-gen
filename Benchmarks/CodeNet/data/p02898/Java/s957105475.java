import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] d = new int[N];
        for (int i = 0; i < N; i++) {
            d[i] = sc.nextInt();
        }
        sc.close();

        System.out.println(HeightLimit(N, K, d));
    }
    public static int HeightLimit(int N, int K, int[] d) {
        if (N <= 0) {
            return 0;
        }
        if (d[N-1] >= K) {
            return 1 + HeightLimit(N-1, K, d);
        }
        return HeightLimit(N-1, K, d);
    }
}
