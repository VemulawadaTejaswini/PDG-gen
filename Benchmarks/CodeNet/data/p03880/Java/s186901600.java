import java.io.*;
import  java.util.*;

import static java.lang.System.in;

class Main{
    public static void main(String[] args)throws IOException{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        int ans = solve(a, n);
        System.out.println(ans);
    }
    static int solve(int[] a, int n){
        int[] mask = new int[31],rec = new int[31];
        for(int i=0;i<31;i++) mask[i]=1<<i;
        boolean[] vis = new boolean[n];
        int ans = 0;
        for(int w:a){
            for(int i=0;i<31;i++) rec[i] += (mask[i]&w)>0?1:0;
        }
        for(int i=30;i>=0;i--){
            if(rec[i]%2==0) continue;
            boolean flag = false;
            for(int j=0;j<n;j++){
                if(vis[j]) continue;
                if((a[j]&mask[i])==0) continue;
                if((a[j]|(mask[i]-1))!=a[j]+(mask[i]-1)) continue;
                flag = true;
                vis[j]=true;
                for(int k=i-1;k>=0;k--) rec[k] += 1;
                ans += 1;
                break;
            }
            if(!flag) return -1;
        }
        return ans;
    }
}
