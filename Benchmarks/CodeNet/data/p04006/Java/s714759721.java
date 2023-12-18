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
                int[] amemo = new int[N];
                for (int i = 0; i < N; i++) {
                        amemo[i] = 1 << 20;
                }
                for (int i = 0; i < N; i++) {
                        int memo = i * x;
                        for (int j = 0; j < N; j++) {
                                amemo[j] = Math.min(amemo[j], a[(j - i + N) % N]);
                                memo += amemo[j];
                        }
                        ans = Math.min(ans, memo);
                }
                System.out.println(ans);
        }
}