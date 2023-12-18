//created by Whiplash99
import java.io.*;
import java.util.*;
public class Main
{
    private static int dist[];
    private static ArrayDeque<Integer> edge[];

    private static void BFS(int i)
    {
        ArrayDeque<Integer> Q=new ArrayDeque<>();
        Q.add(i);

        while (!Q.isEmpty())
        {
            int u=Q.poll();
            for(int v:edge[u])
            {
                if(dist[v]!=-1) continue;
                dist[v]=dist[u]+1;
                Q.add(v);
            }
        }
    }
    public static void main(String[] args) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int i,N;

        String s[]=br.readLine().trim().split(" ");
        N=Integer.parseInt(s[0]);
        int X=Integer.parseInt(s[1])-1;
        int Y=Integer.parseInt(s[2])-1;

        dist=new int[N];
        edge=new ArrayDeque[N];
        for(i=0;i<N;i++) edge[i]=new ArrayDeque<>();

        for(i=0;i<N-1;i++)
        {
            edge[i].add(i+1);
            edge[i+1].add(i);
        }

        edge[X].add(Y);
        edge[Y].add(X);

        int count[]=new int[N];

        for(i=0;i<N;i++)
        {
            Arrays.fill(dist,-1);
            dist[i]=0;
            BFS(i);
            for(int j=0;j<N;j++) count[dist[j]]++;
        }


        StringBuilder sb=new StringBuilder();
        for(i=1;i<N;i++) sb.append(count[i]/2).append("\n");

        System.out.println(sb);
    }
}