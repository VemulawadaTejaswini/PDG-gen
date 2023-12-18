
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] value = new int[n + 1];
        for (int i = 1; i <= n; ++i) {
            value[i] = scanner.nextInt();
        }
        int[][] tree = new int[n + 5][n + 5];
        int[] nodeSons = new int[n + 1];
        for (int i = 1; i < n; ++i) {
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            tree[u][nodeSons[u]++] = v;
            tree[v][nodeSons[v]++] = u;
        }
        int [] ans = new int[n + 1];
        ans[1] = 1;
        int[] dpValue = new int[n];
        for (int i = 0; i < n; ++i) {
            dpValue[i] = Integer.MAX_VALUE;
        }
        int[] changedDpIndex = new int[n + 1];
        int[] changedValue = new int[n + 1];
        for (int i = 1; i <= n; ++i) {
            changedDpIndex[i] = -1;
            changedValue[i] = Integer.MAX_VALUE;
        }
        dfs(tree, changedDpIndex, changedValue, dpValue, ans, 1, value, -1);
        for (int k = 1; k <= n; ++k) {
            System.out.println(ans[k]);
        }
    }
    public static void dfs(
            int[][] tree,
            int[] changedDpIndex,
            int[] changedValue,
            int[] dpValue,
            int[] ans,
            int currentIndex,
            int[] value,
            int father
    ) {
        int binarySearchIndex = Arrays.binarySearch(dpValue, value[currentIndex]);
        int length;
        if (binarySearchIndex >= 0 && binarySearchIndex < dpValue.length) {
            // nodes[currentIndex] = new Node(currentIndex, -1, -1);
            length = ans[father];
        } else {
            int insertPos = -1 - binarySearchIndex;
            changedDpIndex[currentIndex] = insertPos;
            changedValue[currentIndex] = dpValue[insertPos];
            if (dpValue[insertPos] == Integer.MAX_VALUE) {
                length = insertPos + 1;
            } else {
                length = ans[father];
            }
            dpValue[insertPos] = value[currentIndex];
        }
        //  length = -Arrays.binarySearch(dpValue, Integer.MAX_VALUE - 1) - 1;
        ans[currentIndex] = length;

        // visit sons
        for (int son: tree[currentIndex]) {
            if (son == father) {
                continue;
            }
            if (son == 0) {
                break;
            }
            dfs(tree, changedDpIndex, changedValue, dpValue, ans, son, value, currentIndex);
        }

        if (changedDpIndex[currentIndex] != -1) {
            // this node replaced some node before, recover it
            dpValue[changedDpIndex[currentIndex]] = changedValue[currentIndex];
            //    nodes[currentIndex] = new Node(currentIndex, -1, -1);
        }

    }
}
