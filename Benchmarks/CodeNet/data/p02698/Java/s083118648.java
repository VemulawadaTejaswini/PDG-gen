
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

class Node {
    int index;
    int changedDpIndex;
    int changedValue;
    public Node() {
        this.index = -1;
        this.changedValue = -1;
        this.changedDpIndex = -1;
    }
    public Node(int index, int changedDpIndex, int changedValue) {
        this.index = index;
        this.changedDpIndex = changedDpIndex;
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
        Map<Integer, Set<Integer>> tree = new HashMap<>();
        for (int i = 1; i < n; ++i) {
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            if (!tree.containsKey(u)) {
                tree.put(u, new HashSet<>());
            }
            if (!tree.containsKey(v)) {
                tree.put(v, new HashSet<>());
            }
            tree.get(u).add(v);
            tree.get(v).add(u);
        }
        int [] ans = new int[n + 1];
        ans[1] = 1;
        int[] dpValue = new int[n];
        for (int i = 0; i < n; ++i) {
            dpValue[i] = Integer.MAX_VALUE;
        }
        Node[] nodes = new Node[n + 1];
        dfs(tree, nodes, dpValue, ans, 1, value, -1);
        for (int k = 1; k <= n; ++k) {
            System.out.println(ans[k]);
        }
    }
    public static void dfs(
            Map<Integer, Set<Integer>> tree,
            Node[] nodes,
            int[] dpValue,
            int[] ans,
            int currentIndex,
            int[] value,
            int father
    ) {
        int binarySearchIndex = Arrays.binarySearch(dpValue, value[currentIndex]);

        int insertPos = -1 - binarySearchIndex;
        nodes[currentIndex] = new Node(currentIndex, insertPos, dpValue[insertPos]);
        dpValue[insertPos] = value[currentIndex];

        ans[currentIndex] = insertPos + 1;
//        System.out.println("current Index: " + currentIndex);
//        for (int i : dpValue) {
//            System.out.print(i + " ");
//
//        }
//        System.out.println();

        // visit sons
        for (int son: tree.get(currentIndex)) {
            if (son == father) {
                continue;
            }
         //   System.out.println("visit son: " + son);
            dfs(tree, nodes, dpValue, ans, son, value, currentIndex);
        }
        // remove current Index from dp
        if (nodes[currentIndex].changedValue == -1) {
            if (nodes[currentIndex].changedDpIndex >= 0) {
                // this node is newly added
                dpValue[nodes[currentIndex].changedDpIndex] = Integer.MAX_VALUE;
                nodes[currentIndex] = new Node(currentIndex, -1, -1);
            } else {
                // this node didn't replace anything
            }
        } else {
            // this node replaced some node before, recover it
            dpValue[nodes[currentIndex].changedDpIndex] = nodes[currentIndex].changedValue;
            nodes[currentIndex] = new Node(currentIndex, -1, -1);
        }
    }
}
