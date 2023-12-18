import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        new Main().compute();
    }

    int count(long[] target, long a, int start) {
        int n = 0;
        for (int i = start; i < target.length; i++) {
            if (target[i] == a) {
                n++;
            }
        }
        return n;
    }

    void compute() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        long[] v = new long[N];
        for (int i = 0; i < N; i++) {
            v[i] = sc.nextLong();
        }
        long[][] combination = new long[N + 1][N + 1];
        for (int i = 1; i <= N; i++) {
            for (int j = 0; j <= i; j++) {
                if (i == 0 || i == j) {
                    combination[i][j] = 1;
                } else if (i == 1) {
                    combination[i][j] = i;
                } else {
                    try {
                        combination[i][j] = combination[i - 1][j - 1] + combination[i - 1][j];
                    } catch (ArrayIndexOutOfBoundsException e) {
                        combination[i][j] = 1;
                    }
                }

            }
        }
        Arrays.sort(v);
        for (int i = 0; i < N / 2; i++) {
            long tmp = v[i];
            v[i] = v[N - i - 1];
            v[N - i - 1] = tmp;
        }
        long sum = 0;
        for (int i = 0; i < A; i++) {
            sum += v[i];
        }
        System.out.println((double) sum / A);
        long pattern = 0;
        if (v[0] == v[A - 1]) {
            int n = count(v, v[A - 1], 0);
            for (int i = A; i <= B; i++) {
                if (v[A - 1] != v[i - 1]) {
                    break;
                }
                pattern += combination[n][n - i];
            }
        } else {
            int n = count(v, v[A - 1], 0);
            int r = count(v, v[A - 1], A);
            pattern = combination[n][r];

        }
        System.out.println(pattern);
    }
}
