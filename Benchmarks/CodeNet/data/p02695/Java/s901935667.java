import java.util.*;
import java.io.*;
class Main {
    static int min;
    static int count(int[] a, int[][] queries) {
        int ans = 0;
        for(int[] q: queries) {
            if(a[q[1]]-a[q[0]]==q[2])
                ans+=q[3];
        }
        return ans;
    }
    static void recurse(int[] a, int idx, int prev, int m, int[][] queries) {
        if(idx==a.length) {
            min = Math.max(min, count(a, queries));
            return;
        }
        for(int i = prev; i<=m; i++) {
            a[idx] = i;
            recurse(a, idx+1, i, m, queries);
        }
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int q = sc.nextInt();
        int[][] queries = new int[q][];
        for(int i = 0; i<q; i++)
            queries[i] = new int[]{sc.nextInt()-1, sc.nextInt()-1, sc.nextInt(), sc.nextInt()};
        int[] a = new int[n];
        min = Integer.MIN_VALUE;
        recurse(a, 0, 1, m, queries);
        System.out.println(min);
    }
}