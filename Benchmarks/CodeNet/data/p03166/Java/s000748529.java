import java.util.*;
import java.io.*;
public class Main{
    public  static int cal(Integer i,int[]visit,int[]dp,HashMap<Integer,ArrayList<Integer>>reversed_edges){
        if(visit[i]==1)return dp[i];
        else{
            dp[i]=0;
            visit[i]=1;
            if(reversed_edges.containsKey(i)){
                for(Integer m:reversed_edges.get(i)){
                dp[i]=Math.max(dp[i],cal(m,visit,dp,reversed_edges)+1);
                }
            }
        }
        return dp[i];
    }
    public static void main(String[] args){
        int N,M,x,y,res=0;
        Scanner in=new Scanner(System.in);
        N=in.nextInt();
        M=in.nextInt();
        int[]dp=new int[N+1];//dp[i]:以i为终点的最长路径
        int[] visit=new int[N+1];
        HashMap<Integer,ArrayList<Integer>>reversed_edges=new HashMap<>();
        visit[0]=1;
        for(int i=1;i<=M;i++){
            x=in.nextInt();
            y=in.nextInt();
            reversed_edges.put(y,new ArrayList<>());
            reversed_edges.get(y).add(x);
        }
        for(int i=1;i<=N;i++){
            if(reversed_edges.containsKey(i)){
            for(Integer m:reversed_edges.get(i)){
                dp[i]=Math.max(dp[i],cal(m,visit,dp,reversed_edges)+1);
            }
            }
        }
        for(int i=1;i<=N;i++)res=Math.max(res,dp[i]);
        System.out.println(res);
    }
}
