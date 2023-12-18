import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int T = sc.nextInt();
        int A = sc.nextInt();

        int[] H = new int[N];
        for (int i = 0; i < N; i++) {
            H[i] = sc.nextInt();
        }

        double min = Double.MAX_VALUE;
        int ret = -1;

        for (int i = 0; i < N; i++) {
            double t = T - H[i] * 0.006;

            double diff = Math.abs(t - A);
            if (diff < min) {
                ret = i;
                min = diff;
            }
        }

        System.out.println(ret+1);
    }
}