import java.util.*;

import jdk.internal.net.http.common.Pair;

class Main{
    static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int pair = n*(n-1)/2;
        int[] A = new int[n];
        int ans = 0;
        for(int i = 0;i < n;i++){
            A[i] = sc.nextInt();
        }
        
        ans = dfs(A,0,0,1,2);

        System.out.println(ans);
    }

    static int dfs(int[] a,int count,int res,int c,int d){
        if(count == pair)
            return res;
        
        return dfs(a,count+1,Math.abs(c-d) == a[c-1]+a[d-1] ? res+1 : res,d == n?c+1:c,d+1);
    }
}