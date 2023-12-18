
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
        Arrays.fill(ansArr, -1);
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
            tree[u].add(v);
            tree[v].add(u);
        }

        dp[0] = arr[0];
        dfs(0, 0, 0 );

        for (int i = 0; i < n; i++) {
            System.out.println(ansArr[i]);
        }

    }

    void dfs(int i, int prevIdx, int prevVal) {
//        debug(i);
        ArrayList<Integer> nextIdxList = tree[i];
        int ans = lowerBound(dp, Integer.MAX_VALUE);
        ansArr[i] = ans;

        for (int nextIdx : nextIdxList) {
            if (ansArr[nextIdx] != -1) {
                continue;
            }
            int next = arr[nextIdx];
            int j = lowerBound(dp, next);
            int pVal = dp[j];
            dp[j] = next;

            dfs(nextIdx, j , pVal);
        }
        dp[prevIdx] = prevVal;
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
