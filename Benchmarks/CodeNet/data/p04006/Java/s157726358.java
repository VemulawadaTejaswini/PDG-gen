import java.util.*;

class Main {
        public static void main(String args[]) {
                Scanner sc = new Scanner(System.in);
                int N = sc.nextInt(), x = sc.nextInt();
                int[] a = new int[N];
                for (int i = 0; i < N ; i++) {
                        a[i] = sc.nextInt();
                }
                int ans = 1 << 20;
                int xmax = 0;
                for (int i = 0; i < N; i++) {
                        int memo = i * x;
                        for (int j = 0; j < N; j++) {
                                int tmp = 1 << 20;
                                for (int k = 0; k <= i; k++) {
                                        tmp = Math.min(tmp, a[(k - j + N) % N]);
                                }
                                memo += tmp;
                        }
                        ans = Math.min(ans, memo);
                }
                System.out.println(ans);
        }
}