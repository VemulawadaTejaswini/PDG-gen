import java.util.Arrays;
import java.util.Scanner;

class B {
    public static void main(String... args) {
        final Scanner sc = new Scanner(System.in);
        final int A = sc.nextInt();
        final int B = sc.nextInt();
        final int M = sc.nextInt();
        final int[] a = new int[A];
        final int[] b = new int[B];
        final int[] x = new int[M];
        final int[] y = new int[M];
        final int[] c = new int[M];
        Arrays.setAll(a, i -> sc.nextInt());
        Arrays.setAll(b, i -> sc.nextInt());
        for (int i = 0; i < M; i++) {
            x[i] = sc.nextInt() - 1;
            y[i] = sc.nextInt() - 1;
            c[i] = sc.nextInt();
        }
        int ans = Arrays.stream(a).min().orElse(Integer.MAX_VALUE) + Arrays.stream(b).min().orElse(Integer.MAX_VALUE);
        for (int i = 0; i < M; i++)
            ans = Math.min(ans, a[x[i]] + b[y[i]] - c[i]);
        System.out.println(ans);
    }
}
public class Main {
    public static void main(String... args) {
        B.main();
    }
}
