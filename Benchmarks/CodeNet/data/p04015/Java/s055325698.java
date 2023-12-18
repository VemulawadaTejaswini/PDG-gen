import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();

        int[] x = new int[N];
        for (int i = 0; i < N; i++) {
            x[i] = sc.nextInt() - A;
        }

        long ret = 0;

        for (long i = 1; i < (1 << N); i++) {
            int sum = 0;

            for (int j = 0; j < N; j++) {
                if (((i >> j) & 1) == 1) {
                    sum += x[j];
                }
            }

            if (sum == 0) ret++;
        }

        System.out.println(ret);
    }
}