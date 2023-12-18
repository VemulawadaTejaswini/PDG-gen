import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;


public class Main {
    static List<Integer>[] tree;
    static int[] changedDpIndex;
    static int[] changedValue;
    static int[] dpValue;
    static int[] ans;
    static int[] value;
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        value = new int[n + 1];
        Set<Integer> valueAppeared = new HashSet<>();
        for (int i = 1; i <= n; ++i) {
            value[i] = scanner.nextInt();
            valueAppeared.add(value[i]);
        }
        tree = new List[n + 1];
        for (int i = 1; i <= n; ++i) {
            tree[i] = new ArrayList<>();
        }
        for (int i = 1; i < n; ++i) {
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            tree[u].add(v);
            tree[v].add(u);
        }
        ans = new int[n + 1];
        ans[1] = 1;
        dpValue = new int[valueAppeared.size()];
        Arrays.fill(dpValue, Integer.MAX_VALUE);
        changedDpIndex = new int[n + 1];
        changedValue = new int[n + 1];
        for (int i = 1; i <= n; ++i) {
            changedDpIndex[i] = -1;
            changedValue[i] = Integer.MAX_VALUE;
        }
        dfs(1, 0, 0);
        for (int k = 1; k <= n; ++k) {
            System.out.println(ans[k]);
        }
    }
    public static void dfs(
            int currentIndex,
            int father,
            int maxPos
    ) {
        int binarySearchIndex = Arrays.binarySearch(dpValue, 0, maxPos, value[currentIndex]);
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
        maxPos = Math.max(maxPos, length + 1);

        // visit sons
        for (int son: tree[currentIndex]) {
            if (son == father) {
                continue;
            }
            dfs(son, currentIndex, maxPos);
        }

        if (changedDpIndex[currentIndex] != -1) {
            // this node replaced some node before, recover it
            dpValue[changedDpIndex[currentIndex]] = changedValue[currentIndex];
            //    nodes[currentIndex] = new Node(currentIndex, -1, -1);
        }

    }
}
