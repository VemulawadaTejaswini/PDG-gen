import java.util.*;
import java.io.*;

public class Main {
    
    static int n;
    static int[] a;
    static int[] dp;
    static Node[] node;
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        n=Integer.parseInt(br.readLine());
        a=new int[n-1];
        dp=new int[n+1];
        node=new Node[n+1];
        for(int i=0;i<n+1;i++){ node[i]=new Node(); }
        Arrays.fill(dp,-1);
        for(int i=0;i<n-1;i++){
            a[i]=Integer.parseInt(br.readLine());
            node[a[i]].next_list.add(i+2);
        }System.out.println(dfs(1));
    }
    
    static int dfs(int target){
        //System.out.println("target="+target);
        if(dp[target]!=-1){ return dp[target]; }
        int max=0;
        for(int i:node[target].next_list){
            if(max<dfs(i)+i){
                max=dfs(i)+i;
            }
        }
        dp[target]=max;
        return dp[target];
    }
}

class Node{
    ArrayList<Integer> next_list=new ArrayList<>();
}