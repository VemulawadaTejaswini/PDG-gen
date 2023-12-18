import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            int[] t = new int[N];
            int sumT = 0;
            for (int i = 0; i < N; i++) {
                t[i] = in.nextInt();
                sumT += t[i];
            }
            int[] v = new int[N];
            for (int i = 0; i < N; i++) {
                v[i] = in.nextInt();
            }

            int[] v2 = new int[sumT + 1];
            for (int i = 0, i2 = 1; i < N; i++) {
                for (int j = 0; j < t[i]; j++) {
                    v2[i2++] = v[i];
                }
            }
            v2[v2.length - 1] = 0;

            for (int i = 1; i < v2.length; i++) {
                if (v2[i] > v2[i - 1] + 1) {
                    v2[i] = v2[i - 1] + 1;
//                } else if (v2[i] < v2[i - 1] - 1) {
//                    v2[i] = v2[i - 1] - 1;
                }
            }
            for (int i = v2.length - 2; i > 0; i--) {
                if (v2[i] > v2[i + 1] + 1) {
                    v2[i] = v2[i + 1] + 1;
//                } else if (v2[i] < v2[i - 1] - 1) {
//                    v2[i] = v2[i - 1] - 1;
                }
            }
//            Utils.debug(v2);

            double m = 0;
            for (int i = 1; i < v2.length; i++) {
                if (v2[i] != v2[i - 1]) {
                    m += 0.5 + Math.min(v2[i], v2[i - 1]);
                } else {
                    m += v2[i - 1];
                }
//                Utils.debug(i, m);
            }
            System.out.println(m);
        }
    }
}
