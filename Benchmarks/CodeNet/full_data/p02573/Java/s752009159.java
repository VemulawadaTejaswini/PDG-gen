import java.math.BigInteger;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;


public class Main {

    static int[] parent;

    static int find(int i) {
        // If i is the parent of itself
        if (parent[i] == i)
        {
            // Then i is the representative
            return i;
        }
        else
        {
            // Recursively find the representative.
            int result = find(parent[i]);

            // We cache the result by moving i’s node
            // directly under the representative of this
            // set
            parent[i] = result;

            // And then we return the result
            return result;
        }
    }


    static void union(int i, int j)
    {
        // Find the representatives
        // (or the root nodes) for the set
        // that includes i

        int irep = find(i);

        // And do the same for the set
        // that includes j
        int jrep = find(j);

        // Make the parent of i’s representative
        // be j’s  representative effectively
        // moving all of i’s set into j’s set)
        parent[irep] = jrep;
    }

    static void solve() {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int m = scan.nextInt();
        parent = new int[n];
        for(int i=0;i<n;i++) {
            parent[i] = i;
        }
        for(int i = 0; i < m; i++) {
            int f = scan.nextInt();
            int s = scan.nextInt();
            union(f-1, s-1);
        }
        int[] cnt = new int[n];
        int max = 0;
        for(int i=0;i < n;i++) {
            int p = find(i);
            cnt[p]++;
            max = Math.max(max, cnt[p]);
        }
        System.out.println(max);

//        int t = scan.nextInt();
//        for (int i = 0; i < t; i++) {
////            solveCase();
//        }


//        long t = scan.nextLong();

//        for (int i = 0; i < t; i++) {
//            int n = scan.nextInt();
////            scase(n);
//        }
    }


    static void solveCase(int zero1, int one1, int two1, int zero2, int one2, int two2) {

    }

    static void scase(int[] arr1, int[] arr2) {
    }


    public static void main(String[] args) {
//        Main m = new Main();
        solve();
    }


    static class LoggerNode {
        String message;
        int ts;
    }


    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}