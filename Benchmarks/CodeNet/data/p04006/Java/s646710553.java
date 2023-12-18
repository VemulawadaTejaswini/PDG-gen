import java.util.*;

class Main {
        public static void main(String args[]) {
                Scanner sc = new Scanner(System.in);
                int N = sc.nextInt(), x = sc.nextInt();
                int[] a = new int[N];
                for (int i = 0; i < N ; i++) {
                        a[i] = sc.nextInt();
                }
                int ans = 0;
                int xmax = 0;
                for (int i = 0; i < N; i++) {
                        int tmp = 1 << 20;
                        for (int j = 0; j < N; j++) {
                                if (tmp > a[(i - j + N) % N] + j * x) {
                                        tmp = Math.min(tmp, a[(i - j + N) % N] + j * x);
                                        xmax = Math.max(xmax, j);
                                }
                        }
                }
                for (int i = 0; i < N; i++) {
                        int tmp = 1 << 20;
                        for (int j = 0; j <= xmax; j++) {
                                if (tmp > a[(i - j + N) % N] + j * x) {
                                        tmp = Math.min(tmp, a[(i - j + N) % N]);
                                }
                        }
                        ans += tmp;
                }
                System.out.println(ans + xmax * x);
        }
}