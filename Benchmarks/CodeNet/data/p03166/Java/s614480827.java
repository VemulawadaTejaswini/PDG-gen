/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aakas
 */
import java.util.*;
public class Main{
    static int n;
    static int m;
    static ArrayList<Integer>[] adjList;
    static boolean[] v;
    static int[] dp;
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        adjList = new ArrayList[n+1];
        //visited = new boolean[n];
        v = new boolean[n+1];
        dp = new int[n+1];
        for(int i=0;i<=n;i++)
            adjList[i] = new ArrayList<Integer>();
        for(int i=0;i<m;i++)
            adjList[sc.nextInt()].add(sc.nextInt());
        int temp = Integer.MIN_VALUE;
        for(int i=1;i<=n;i++)
        {
            //boolean[] visited = new boolean[n+1];
            temp = Math.max(dfs(i),temp);
        }
        System.out.println(temp);
    }
    public static int dfs(int s)
    {
        //System.out.println("call for "+s+" "+visited[s]);
        //if(visited[s])
          //  return 0;
        if(v[s])
            return dp[s];
        v[s] = true;
        //visited[s] = true;
        for(int i=0;i<adjList[s].size();i++)
        {
            int v = adjList[s].get(i);
            //System.out.println(s+ " -> "+v);
            //if(!visited[v])
            //{
                 dp[s] = Math.max(1+dfs(v),dp[s]);
                 //System.out.println(s+" "+dp[s]);
            
        }
        //System.out.println(s+" "+dp[s]);
        return dp[s];
    }
}
