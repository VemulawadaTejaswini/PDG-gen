import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int len = sc.nextInt();
        int[] N = new int[len];
        for (int i =0; i < len; i++) {
            N[i] = sc.nextInt();
        }

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < N.length; i++) {
            int n = 0;
            if (i < N.length - 1) {
                n += next(N, i);
            }
            if (i > 0) {
                n += bef(N, i);
            }
            min = Math.min(min, n);
        }

        System.out.println(min);

    }
    public static int next(int[] n, int idx) {
        if (idx >= n.length - 1) {
            return 0;
        }
        return next(n, idx + 1) + n[idx + 1] - n[idx];
    }
    public static int bef(int[] n, int idx) {
        if (idx - 1 < 0) {
            return 0;
        }
        return n[idx] - n[idx - 1] + bef(n, idx - 1);
    }
}