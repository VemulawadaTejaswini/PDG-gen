import java.util.*;
import java.io.*;
class Main {
    static long[][] dp1;
    static long recurse1(long[] a, int i, int j) {
        if(i>j)
            return 0;
        if(i==j)
            return a[i];
        if(dp1[i][j]!=-1)
            return dp1[i][j];
        long max = Math.max(a[i]-recurse1(a, i+1, j), a[j]-recurse1(a, i, j-1));
        return dp1[i][j] = max;
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        for(int i = 0; i<n; i++)
            a[i] = sc.nextLong();
        dp1 = new long[n][n];
        for(long[] i: dp1)
            Arrays.fill(i, -1);
        System.out.println(recurse1(a, 0, n-1));
    }
}