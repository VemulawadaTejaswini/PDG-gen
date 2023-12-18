import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // ABC154D - Dice in Line  ... TLE

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] p = new int[n];
        int[] p3 = new int[n];

        int max = 0;
        int idx = 0;

        for (int i = 0; i < n; i++) {
            p[i] = sc.nextInt();
            if (i == k - 1) {
                for (int j = 0; j < k; j++) {
                    p3[i - k + 1] += p[i - j];
                }
                max = p3[i - k + 1];
                idx = i - k + 1;
            } else if (i > k - 1) {

//                System.out.println("------------------");
//                System.out.println("p3[" + (i - k + 1) + "]=" + p3[i - k + 1]);
//                System.out.println("max=" + max);
//                System.out.println("idx=" + idx);
                p3[i - k + 1] = p3[i - k] + p[i] - p[i - k];
                if (max < p3[i - k + 1]) {
                    max = p3[i - k + 1];
                    idx = i - k + 1;
//                    System.out.println("->max=" + max);
//                    System.out.println("->idx=" + idx);
                }
            }
        }

        double[] e = new double[k];
        double ans = 0;

        // 期待値
        for (int i = 0; i < k; i++) {
            for (int j = 1; j <= p[idx + i]; j++) {
                e[i] += j;
            }
            e[i] /= p[idx + i];
            ans += e[i];
        }

        System.out.println(ans);
    }
}
