
import java.util.*;

public class Main {
    int[] tree;
    int n;
    void run() {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0 ; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        tree = new int[n];
        for (int i = 0; i < n - 1; i++) {
            int u = sc.nextInt() - 1;
            int v = sc.nextInt() - 1;
            if (u < v) {
                tree[v] = u;
            } else {
                tree[u] = v;
            }
        }

        for (int i = 0; i < n; i++) {
            int[] dp = new int[n + 1];
            Arrays.fill(dp, Integer.MIN_VALUE);
            int next = i;
            while(true) {
                int a = arr[next];
                int k = upperBound(dp, a) - 1;
                dp[k] = a;
                if (next == 0) {
                    break;
                }
                next = tree[next];
            }

            int ans = 1;
            for (int j = 0; j < n; j++) {
                if (dp[j] != Integer.MIN_VALUE) {
                    ans++;
                }
            }
            System.out.println(ans);

        }

    }

    public int upperBound(int[] array, int value) {
        int left = -1;
        int right = array.length;
        while (right - left > 1) {
            int middle = (right + left) / 2;
            if (array[middle] > value) {
                right = middle;
            } else {
                left = middle;
            }
        }
        return right;
    }

    public int lowerBound(int[] array, int value) {
        int left = -1;
        int right = array.length;
        while (right - left > 1) {
            int middle = (right + left) / 2;
            if (array[middle] >= value) {
                right = middle;
            } else {
                left = middle;
            }
        }
        return right;
    }



    void debug(Object... os) {
        System.err.println(Arrays.deepToString(os));
    }

    public static void main(String[] args) {
        new Main().run();
    }
}
