import java.util.*;
import java.io.*;

public class Main {
    
    static int n;
    static int[] a;
    static int[] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        n=Integer.parseInt(br.readLine());
        a=new int[n];
        dp=new int[n+1];
        Arrays.fill(dp,-1);
        int count=0;
        for(int i=0;i<n-1;i++){ a[i]=Integer.parseInt(br.readLine()); }
        for(int i=0;i<n-1;i++){
            if(a[i]==1){ count=Math.max(count,dfs(i+2)); }
        }System.out.println(count+1);
    }
    
    static int dfs(int target){
        if(dp[target]!=-1){ return dp[target]; }
        int count=0;
        for(int i=0;i<n-1;i++){
            if(a[i]==target){
                count+=dfs(i+2)+1;
            }
        }dp[target]=count;
        return count;
    }
}