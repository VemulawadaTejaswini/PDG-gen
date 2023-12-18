import java.util.*;

public class Main {
    static long mod = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] lis = new int[n];

        for (int i = 0; i < n; ++i) {
            lis[i] = sc.nextInt();
        }

        int ans = 0;
        PriorityQueue<Integer> que = new PriorityQueue<Integer>();
        int lim = Math.min(n, m);
        for (int i = 0; i <= lim; ++i) {
            int lim2 = lim - i;
            for (int j = 0; j <= lim2; ++j) {
                int lim3 = m - i - j;
                int total = 0;
                que.clear();
                for (int a = 0; a < i; ++a) {
                    total += lis[a];
                    if (lis[a] < 0) {
                        que.add(lis[a]);
                    }
                }
                for (int a = 0; a < j; ++a) {
                    total += lis[n - a - 1];
                    if (lis[n - a - 1] < 0) {
                        que.add(lis[n - a - 1]);
                    }
                }

                for (int k = 0; k < lim3 && 0 < que.size(); ++k) {
                    total -= que.poll();
                }
                ans = Math.max(ans, total);
            }
        }
        System.out.println(ans);
    }
}
