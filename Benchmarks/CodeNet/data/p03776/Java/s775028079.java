import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        new Main().compute();
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
        Arrays.sort(v);
        for (int i = 0; i < N / 2; i++) {
            long tmp = v[i];
            v[i] = v[N - i - 1];
            v[N - i - 1] = tmp;
        }
        double maxAverage = 0;
        long pattern = 0;
        check:
        for (int i = A; i <= B; i++) {
            long sum = 0;
            for (int j = 0; j < i; j++) {
                sum += v[j];
            }
            double currentAverage = (double) sum / i;
            if (maxAverage <= currentAverage) {
                maxAverage = currentAverage;
                pattern += pattern(v, i - 1);
            } else if (maxAverage > currentAverage) {
                break check;
            }

        }
        System.out.println(maxAverage);
        System.out.println(pattern);
    }

    long pattern(long[] v, int index) {
        int first = 0, n = 0, r = 0;
        long[] vcpy = new long[v.length + 1];
        for (int i = 0; i < v.length; i++) {
            vcpy[i] = v[i];
        }
        vcpy[v.length] = -1;
        for (int i = 0; i < vcpy.length; i++) {
            if (vcpy[i] == vcpy[index]) {
                first = i;
                r = index - i + 1;
                break;
            }
        }
        for (int i = index; i < vcpy.length; i++) {
            if (vcpy[i] != vcpy[index]) {
                n = i - first;
                break;
            }
        }
        return calcCombination(n, r);
    }

    long calcCombination(int n, int m) {
        long c = 1;
        m = (n - m < m ? n - m : m);
        for (int ns = n - m + 1, ms = 1; ms <= m; ns++, ms++) {
            c *= ns;
            c /= ms;
        }
        return c;
    }
}
