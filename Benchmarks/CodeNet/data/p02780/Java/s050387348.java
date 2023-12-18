import java.util.Arrays;
import java.util.Scanner;

class D {
    public static void main(String... args) {
        final Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        final int K = sc.nextInt();
        final int[] p = new int[N];
        Arrays.setAll(p, i -> sc.nextInt());
        final double[] e = new double[N];
        Arrays.setAll(e, i -> .5 * p[i] * (p[i] + 1) / p[i]);
        double sum = 0;
        for(int i = 0; i < K; i++)
            sum += e[i];
        double max = sum;
        for(int i = K; i < N; i++) {
            sum -= e[i - K];
            sum += e[i];
            max = Math.max(max, sum);
        }
        System.out.println(max);
    }
}
public class Main {
    public static void main(String... args) {
        D.main();
    }
}
