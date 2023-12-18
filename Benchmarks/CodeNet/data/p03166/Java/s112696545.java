//package atcoder_edu_dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main
{
    static class FastReader
    {
        BufferedReader br;
        StringTokenizer st;

        public FastReader()
        {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next()
        {
            while (st == null || !st.hasMoreElements())
            {
                try
                {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException  e)
                {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt()
        {
            return Integer.parseInt(next());
        }

        long nextLong()
        {
            return Long.parseLong(next());
        }

        double nextDouble()
        {
            return Double.parseDouble(next());
        }

        String nextLine()
        {
            String str = "";
            try
            {
                str = br.readLine();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            return str;
        }
    }
/*
dp[node] = 1+dp[inc_edgeNode]
 */
    public static void topoSort(int node,LinkedList<Integer>[] adj,boolean[] visited,Stack<Integer> topo){
        visited[node] = true;
        for(int nei : adj[node]){
            if(!visited[nei])
                topoSort(nei,adj,visited,topo);
        }
        topo.push(node);

    }
    public static void main(String[] args)
    {
        FastReader sc=new FastReader();
        int n = sc.nextInt();
        int m = sc.nextInt();
        @SuppressWarnings("unchecked") LinkedList<Integer>[] inc_edgeNodeList = new LinkedList[n+1];
        @SuppressWarnings("unchecked") LinkedList<Integer>[] adj = new LinkedList[n+1];
        for(int i=0;i<=n;i++){
            inc_edgeNodeList[i] = new LinkedList<Integer>();
            adj[i] = new LinkedList<Integer>();
        }
        for(int i=0;i<m;i++){
            int from = sc.nextInt();
            int to = sc.nextInt();
            adj[from].add(to);
            inc_edgeNodeList[to].add(from);
        }
        //topo sort
        Stack<Integer> topo = new Stack<>();
        boolean[] visited = new boolean[n+1];
        for(int i=1;i<=n;i++){
            if(!visited[i]){
                topoSort(i,adj,visited,topo);
            }
        }
        int[] dp = new int[n+1];
        int res = Integer.MIN_VALUE;
        while(!topo.isEmpty()){
            int node = topo.pop();
            for(int inc_edgeNode : inc_edgeNodeList[node]){
                dp[node] = Math.max(1+dp[inc_edgeNode],dp[node]);
            }
            res = Math.max(res,dp[node]);
        }

        System.out.println(res);
    }
}