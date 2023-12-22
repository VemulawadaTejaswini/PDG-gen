
import java.io.PrintWriter;
import java.util.*;

public class Main {
    List<Integer>[] tree;
    int[] arr;
    int[] ansArr;
    int n;
    int[] dp;

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
        tree = new List[n];
        for (int i = 0; i < n; i++) {
            tree[i] = new ArrayList<>();
        }
        for (int i = 0; i < n - 1; i++) {
            int u = sc.nextInt() - 1;
            int v = sc.nextInt() - 1;
            tree[u].add(v);
            tree[v].add(u);
        }

        dfs(0, 0, 0);

        StringBuilder out = new StringBuilder();

        for (int i = 0; i < n; i++) {
            out.append(ansArr[i]);
            out.append("\n");
        }

        PrintWriter pw = new PrintWriter(System.out);
        pw.println(out);
        pw.flush();
        pw.close();


    }

    void dfs(int i, int p, int len) {
        int a = arr[i];
        int j;
        if (len == 0 || dp[len - 1] < a) {
            j = len;
            len++;
        } else {
            j = lowerBound(dp, a);
        }
        int tmp = dp[j];
        dp[j] = a;

//        // ans計算
//        if (j == len) {
//            len++;
//        }
        ansArr[i] = len;
//        int ans = lowerBound(dp, Integer.MAX_VALUE);
//        ansArr[i] = ans;

        for (int nextIdx : tree[i]) {
            if (nextIdx == p) {
                continue;
            }
            dfs(nextIdx, i, len);
        }
        dp[j] = tmp;
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
