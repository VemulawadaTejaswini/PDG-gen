import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] bits = new int[M];
        for (int i = 0; i < M; i++) {
            int n = sc.nextInt();
            for (int j = 0; j < n; j++) {
                bits[i] += Math.pow(2, sc.nextInt() - 1);
            }
        }

        int[] p = new int[M];
        for (int i = 0; i < M; i++) {
            p[i] = sc.nextInt();
        }

        int c = (int) Math.pow(2, N);
        int res = 0;
        for (int num = 0; num < c; num++) {
            boolean isOk = true;
            for (int i =0; i < M; i++) {
                int amp = num & bits[i];
                if (Integer.bitCount(amp) % 2 != p[i]) {
                     isOk = false;
                }
            }

            if (isOk) {
                res++;
            }
        }

        System.out.println(res);
    }
}