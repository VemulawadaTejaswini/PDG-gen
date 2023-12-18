import java.io.*;
import java.util.*;
import java.lang.*;

public class Main {
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
                    catch (IOException e)
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
    static int V =9;
    public int min_distance(boolean sptSet[],int dist[]){
        int min =Integer.MAX_VALUE;
        int min_vertex=0;
        for(int v=1;v<V;v++){
            if(!sptSet[v] && dist[v]<min){
                min=dist[v];
                min_vertex=v;
            }
        }
        return min_vertex;
    }
    void print_solution(int dist[]){
        for (int i = 1; i <V ; i++) {
            System.out.println(i+" "+dist[i]);
        }

    }
    public int[] shortest_path(int graph[][],int src){
        int dist[]=new int[V];
        boolean sptSet[] = new boolean[V];
        for (int i = 1; i <V ; i++) {
            dist[i]=Integer.MAX_VALUE;
        }
        dist[src]=0;
        for (int i = 1; i < V; i++) {
            int u = min_distance(sptSet,dist);
            sptSet[u]=true;
            for (int j = 1; j <V ; j++) {
                if(!sptSet[j] && graph[u][j]!=0 && dist[u] != Integer.MAX_VALUE && dist[u]+graph[u][j]<dist[j]){
                    dist[j]=dist[u]+graph[u][j];
                }
            }
        }
        //print_solution(dist);
        return dist;
    }
    public static void print_graph(int graph[][]){
        for (int i = 1; i <graph.length ; i++) {
            for (int j = 1; j <graph.length ; j++) {
                System.out.print(graph[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        /*int graph[][] = new int[][] { { 0, 4, 0, 0, 0, 0, 0, 8, 0 },
                { 4, 0, 8, 0, 0, 0, 0, 11, 0 },
                { 0, 8, 0, 7, 0, 4, 0, 0, 2 },
                { 0, 0, 7, 0, 9, 14, 0, 0, 0 },
                { 0, 0, 0, 9, 0, 10, 0, 0, 0 },
                { 0, 0, 4, 14, 10, 0, 2, 0, 0 },
                { 0, 0, 0, 0, 0, 2, 0, 1, 6 },
                { 8, 11, 0, 0, 0, 0, 1, 0, 7 },
                { 0, 0, 2, 0, 0, 0, 6, 7, 0 } };

         */
        FastReader ob = new FastReader();
        int n = ob.nextInt();
        int x=ob.nextInt(),y=ob.nextInt();
        int graph[][] = new int[n+1][n+1];
        V=n+1;
        for (int i = 1; i <n ; i++) {
            graph[i][i+1]=1;
            graph[i+1][i]=1;
        }
        graph[x][y]=1;
        graph[y][x]=1;
        //print_graph(graph);
        ShortestPath t = new ShortestPath();
        int ans[] =  new int[V];
        int count=0;
        for (int i =1; i <V-1 ; i++) {
            int dist[] =  new int[V];
            dist=t.shortest_path(graph,i);
            for (int j = i; j <V ; j++) {
                if(dist[j]!=0){
                    ans[dist[j]]++;
                }
            }
        }
        for (int i = 1; i <V-1 ; i++) {
            System.out.println(ans[i]);
        }


        
    }
}