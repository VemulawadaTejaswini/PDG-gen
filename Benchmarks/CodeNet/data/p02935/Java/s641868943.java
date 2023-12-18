import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            int[] v = new int[N];
            for (int i = 0; i < N; i++) {
                v[i] = in.nextInt();
            }

            Arrays.sort(v);

            double res = 0;
            for (int i = N - 1, div = 2; i >= 0; i--, div *= 2) {
                if (i == 0) {
                    div /= 2;
                }
                res += (double) v[i] / div;
            }

            System.out.println(res);
        }
    }
}
