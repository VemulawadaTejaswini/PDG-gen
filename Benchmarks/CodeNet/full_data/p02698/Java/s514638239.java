
import java.util.*;

public class Main {
    ArrayList<Integer>[] tree;
    int[] arr;
    int[] ansArr;
    int n;
    int[] dp;
    ArrayDeque<Integer[]> q = new ArrayDeque<>();

    void run() {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n];
        ansArr = new int[n];
        dp = new int[n + 1];

        Arrays.fill(dp, Integer.MAX_VALUE);
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        tree = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            tree[i] = new ArrayList<>();
        }
        for (int i = 0; i < n - 1; i++) {
            int u = sc.nextInt() - 1;
            int v = sc.nextInt() - 1;
            if (u < v) {
                tree[u].add(v);
            } else {
                tree[v].add(u);
            }
        }

        dp[0] = arr[0];
        dfs(0);

        for (int i = 0; i < n; i++) {
            System.out.println(ansArr[i]);
        }

    }

    void dfs(int i) {
        ArrayList<Integer> nextIdxList = tree[i];
//        debug(nextIdxList);
        int ans = 0;
        for (int j = 0; j < n; j++) {
            if (dp[j] != Integer.MAX_VALUE) {
                ans++;
            }
        }
        ansArr[i] = ans;

        if (nextIdxList.isEmpty()) {
//            int ans = 0;
//            for (int j = 0; j < n; j++) {
//                if (dp[j] != Integer.MAX_VALUE) {
//                    ans++;
//                }
//            }
//            ansArr[i] = ans;
            return;
        }
        for (int nextIdx : tree[i]) {
            int next = arr[nextIdx];
            int j = lowerBound(dp, next);
//            debug(i, nextIdx, next,j,  dp);

            q.push(new Integer[]{j, dp[j]});
            dp[j] = next;

            dfs(nextIdx);
            Integer[] previous = q.remove();
            dp[previous[0]] = previous[1];
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
