import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        int[][] x = new int[N][];
        int[][] y = new int[N][];
        for (int i = 0; i < A.length; i++) {
            A[i] = sc.nextInt();
            if (A[i] == 0) {
                continue;
            }
            x[i] = new int[A[i]];
            y[i] = new int[A[i]];
            for (int j = 0; j < A[i]; j++) {
                x[i][j] = sc.nextInt();
                y[i][j] = sc.nextInt();
            }
        }
        int max = 0;
        int p = (int)Math.pow(2, N);
        for (int i = 0; i < p; i++) {
            boolean ok = true;
            loop: for (int j = 0; j < N; j++) {
                if ((i & (1 << j)) == 0) {
                    continue;
                }
                int human = N - j - 1;
                if (x[human] == null) {
                    continue;
                }
                for (int k = 0; k < x[human].length; k++) {
                    int shift = N - x[human][k];
                    if (y[human][k] == 1) {
                        if ((i & (1 << shift)) == 0) {
                            ok = false;
                            break loop;
                        }
                    } else {
                        if ((i & (1 << shift)) != 0) {
                            ok = false;
                            break loop;
                        }
                    }
                }
            }
            if (ok) {
                max = Math.max(max, Integer.bitCount(i));
            }
        }
        System.out.println(max);
        sc.close();
    }
}