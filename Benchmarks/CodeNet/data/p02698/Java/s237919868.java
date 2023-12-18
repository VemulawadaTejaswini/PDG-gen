
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
            Arrays.fill(dp, Integer.MAX_VALUE);
            int next = i;
            List<Integer> list = new ArrayList<>();
            while(true) {
                list.add(arr[next]);
                if (next == 0) {
                    break;
                }
                next = tree[next];
            }

            Collections.reverse(list);

            for (int j = 0; j < list.size(); j++) {
                int a = list.get(j);
                int k = lowerBound(dp, a);
                dp[k] = a;
//                debug(dp);
            }

            int ans = 0;
            for (int j = 0; j < n; j++) {
                if (dp[j] != Integer.MAX_VALUE) {
                    ans++;
                }
            }
            System.out.println(ans);

        }

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
