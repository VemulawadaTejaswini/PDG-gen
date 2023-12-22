import java.util.*;
import java.io.*;
public class Main
{
    static ArrayList<Integer> edge[];
    public static void dfs(int src,boolean vis[],TreeSet<Integer> ts)
    {
        vis[src]=true;
        ts.add(src);
        for(int i=0;i<edge[src].size();i++)
        {
            int temp=edge[src].get(i);
            if(!vis[temp])
            dfs(temp,vis,ts);
        }
    }
    public static void main(String args[])throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw=new PrintWriter(System.out);
        String str[]=br.readLine().split(" ");
        int n=Integer.parseInt(str[0]);
        int m=Integer.parseInt(str[1]);
        edge=new ArrayList[n+1];
        for(int i=1;i<=n;i++)
        edge[i]=new ArrayList<>();
        for(int i=0;i<m;i++)
        {
            str=br.readLine().split(" ");
            int u=Integer.parseInt(str[0]);
            int v=Integer.parseInt(str[1]);
            edge[u].add(v);
            edge[v].add(u);
        }
        TreeSet<Integer> ts=new TreeSet<>();
        dfs(1,new boolean[n+1],ts);
        if(ts.size()!=n)
        pw.println("No");
        else
        {
            pw.println("Yes");
            int depth[]=new int[n+1];
            Queue<Integer> queue=new LinkedList<>();
            queue.add(1);
            boolean vis[]=new boolean[n+1];
            vis[1]=true;
            while(!queue.isEmpty())
            {
                int node=queue.poll();
                for(int i=0;i<edge[node].size();i++)
                {
                    if(!vis[edge[node].get(i)])
                    {
                        vis[edge[node].get(i)]=true;
                        queue.add(edge[node].get(i));
                        depth[edge[node].get(i)]=depth[node]+1;
                    }
                }
            }
            for(int i=2;i<=n;i++)
            pw.println(depth[i]);
        }
        pw.flush();
        pw.close();
    }
}