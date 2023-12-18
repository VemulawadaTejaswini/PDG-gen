import java.util.*;
import java.io.*;

public class Main {
    
    static int n;
    static int[] a;
    static int[] index;
    static int[] dp;
    static int[] times;
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        n=Integer.parseInt(br.readLine());
        a=new int[n-1];
        index=new int[n];
        dp=new int[n+1];
        times=new int[n];
        index[0]=1;
        Arrays.fill(dp,-1);
        int count=0;
        for(int i=0;i<n-1;i++){
            a[i]=Integer.parseInt(br.readLine());
            times[a[i]-1]++;
            index[i+1]=i+2;
        }
        int one=times[0];
        //quick(times,0,n-1);
        for(int i=0;i<n;i++){
            if(times[i]==0){
                count=Math.max(count,dfs(a[index[i]-2]));
            }
        }System.out.println(count+1);
        //System.out.println(Arrays.toString(times)+"\n"+Arrays.toString(index));
    }
    
    static int dfs(int target){
        //System.out.println("target="+target);
        if(dp[target]!=-1){ return dp[target]; }
        if(target==1) return 0;
        dp[target]=dfs(a[target-2])+times[target-1];
        return dp[target];
    }
}