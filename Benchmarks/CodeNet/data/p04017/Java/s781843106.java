import java.util.*;

class Main {
        public static void main(String args[]) {
                Scanner sc = new Scanner(System.in);
                int N = sc.nextInt();
                int[] x = new int[N];
                for (int i = 0; i < N; i++) {
                        x[i] = sc.nextInt();
                }
                int[] c = new int[N];
                for (int i = 0; i < N; i++) {
                        c[i] = -1;
                }
                int L = sc.nextInt(), Q = sc.nextInt();
                int idx = 0;
                while (idx < N && x[idx] - x[0] <= L) {
                        idx++;
                }
                if (idx == N) {
                        for (int i = 0; i < Q; i++) {
                                System.out.println(1);
                        }
                        return;
                }
                c[0] = idx - 1;
                for (int i = 1; i < N; i++) {
                        while (idx < N && x[idx] - x[i] <= L) {
                                idx++;
                        }
                        if (idx == N) {
                                while (i < N) {
                                        c[i] = N - 1;
                                        i++;
                                }
                        } else {
                                c[i] = idx - 1;
                        }
                }
                for (int i = 0; i < Q; i++) {
                        int a = sc.nextInt(), b = sc.nextInt();
                        a--; b--;
                        if (a > b) {
                                int z = a;
                                a = b;
                                b = z;
                        }
                        int ans = 0;
                        while (a < b) {
                                a = c[a];
                                ans++;
                        }
                        System.out.println(ans);
                }
        }
}