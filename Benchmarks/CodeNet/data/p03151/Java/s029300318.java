import java.util.*;
import java.io.*;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args)throws IOException{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] A = new long[n], B = new long[n];
        for(int i=0;i<n;i++) A[i]=sc.nextLong();
        for(int i=0;i<n;i++) B[i]=sc.nextLong();
        int ans = help(n,A,B);
        System.out.println(ans);
    }
    static int help(int n, long[] a, long[] b){
        long sum = 0;
        long[] c = new long[n];
        for(int i=0;i<n;i++) c[i]=a[i]-b[i];
        for(long w:c) sum += w;
        if(sum<0) return -1;
        boolean flag = true;
        for(int i=0;i<n;i++) flag &= a[i]>=b[i];
        if(flag) return 0;
        Arrays.sort(c);
        int  left = 0, right = n-1;
        boolean[] vis = new boolean[n];
        while(c[left]<0){
            if(c[left]+c[right]==0){
                vis[left]=vis[right]=true;
                left++;
                right--;
            }else if(c[left]+c[right]>0){
                vis[left]=vis[right]=true;
                c[right]+=c[left];
                left++;
            }else{
                vis[left]=vis[right]=true;
                c[left] += c[right];
                right--;
            }
        }
        int ans = 0;
        for(int i=0;i<n;i++) ans += vis[i]?1:0;
        return ans;
    }
}
