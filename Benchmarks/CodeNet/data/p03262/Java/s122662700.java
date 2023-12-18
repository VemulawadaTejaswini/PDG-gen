import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int X = sc.nextInt();

        int[] x = new int[N];
        for (int i = 0; i < N; i++) {
            x[i] = sc.nextInt();
        }

        int[] distances = new int[N];
        for (int i = 0; i < N; i++) {
            if (x[i] >= X) {
                distances[i] = x[i] - X;
            } else {
                distances[i] = X - x[i];
            }
        }

        int ret = distances[0];
        for (int i = 1; i < N; i++) {
            ret = gcd(ret, distances[i]);
        }

        System.out.println(ret);
    }

    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}
