import java.io.*;
import java.util.*;

public class Main {

    static PrintStream out = System.out;

    static int[] parent;
    static int[] sz;     // sz[i]表示以i为根的集合中元素个数

    static int findRoot(int p) {
        while (p != parent[p]) {
            parent[p] = parent[parent[p]];
            p = parent[p];
        }
        return p;
    }

    static void union(int a, int b) {
        int aRoot = findRoot(a);
        int bRoot = findRoot(b);
        if (aRoot == bRoot)
            return;
        /**
         * 根据两个元素所在树的元素个数不同判断合并方向, 将元素个数少的集合合并到元素个数多的集合上
         */
        if (sz[aRoot] < sz[bRoot]) {
            parent[aRoot] = bRoot;
            sz[bRoot] += sz[aRoot];
        } else {
            parent[bRoot] = aRoot;
            sz[aRoot] += sz[bRoot];
        }
    }

    static int n, m;

    static void solve(Scanner in) {
        n = in.nextInt();
        m = in.nextInt();
        parent = new int[n + 1];
        sz = new int[n + 1];
        /** 初始化, 每一个parent[i]指向自己, 表示每一个元素自己自成一个集合 */
        for (int i = 1; i <= n; i++) {
            parent[i] = i;
            sz[i] = 1;
        }
        int[] a = new int[n+1];
        int[] b = new int[n+1];
        for(int i = 0; i < m; i++){
            a[i] = in.nextInt();
            b[i] = in.nextInt();
        }

        long cur = (long)n * (long)(n-1) / 2L;

        long[] res = new long[m+1];
        int p = m;
        res[p--] = cur;
        for(int i = m - 1; i >= 0; i--){
            if(findRoot(a[i]) == findRoot(b[i])){ //如果 a[i]和b[i]已经在同一个集合了，则不需要-了
                res[p--] = cur;
                continue;
            }
            cur -= (long)sz[findRoot(a[i])] * (long)sz[findRoot(b[i])];
            res[p--] = cur;
            union(a[i], b[i]);
        }
        for(int i = 1; i <= m; i++)
            out.println(res[i]);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedInputStream(System.in));
        solve(in);
    }
}