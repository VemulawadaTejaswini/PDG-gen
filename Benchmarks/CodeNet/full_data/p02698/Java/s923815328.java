
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Node {
    int index;
    int changedDpIndex;
    int changedValue;
    public Node() {
        this.index = -1;
        this.changedValue = -1;
        this.changedDpIndex = -1;
    }
    public void setChangedDpIndex(int changedDpIndex) {
        this.changedDpIndex = changedDpIndex;
    }
    public void setChangedValue(int changedValue) {
        this.changedValue = changedValue;
    }
}
public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] value = new int[n + 1];
        for (int i = 1; i <= n; ++i) {
            value[i] = scanner.nextInt();
        }
        List<Integer>[] tree = new List[n + 1];
        for (int i = 1; i <= n; ++i) {
            tree[i] = new ArrayList<>();
        }
        for (int i = 1; i < n; ++i) {
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            tree[u].add(v);
            tree[v].add(u);
        }
        int [] ans = new int[n + 1];
        ans[1] = 1;
        int[] dpValue = new int[n];
        for (int i = 0; i < n; ++i) {
            dpValue[i] = 1000000005;
        }
        Node[] nodes = new Node[n + 1];
        for (int i = 1; i <= n; ++i) {
            nodes[i] = new Node();
        }
        dfs(tree, nodes, dpValue, ans, 1, value, -1);
        for (int k = 1; k <= n; ++k) {
            System.out.println(ans[k]);
        }
    }
    public static void dfs(
            List<Integer>[] tree,
            Node[] nodes,
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
            nodes[currentIndex].setChangedDpIndex(insertPos);
            nodes[currentIndex].setChangedValue(dpValue[insertPos]);
            if (dpValue[insertPos] == 1000000005) {
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
            dfs(tree, nodes, dpValue, ans, son, value, currentIndex);
        }

        if (nodes[currentIndex].changedDpIndex != -1) {
            // this node replaced some node before, recover it
            dpValue[nodes[currentIndex].changedDpIndex] = nodes[currentIndex].changedValue;
            //    nodes[currentIndex] = new Node(currentIndex, -1, -1);
        }

    }
}
