import java.util.*;

public class Main {
    static long[][] graph;
    static long[][] shortestPath;
    static int count;
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        count = Integer.valueOf(input);
        graph = new long[count][count];
        shortestPath = new long[count][count];
        for( int i = 0 ; i<count ; i++)
            for(int j = 0 ; j <count ; j++)
            {
                if(i==j)
                {
                    graph[i][j] = 0;
                    shortestPath[i][j] = 0;
                }
                else
                {
                    graph[i][j] = Long.MAX_VALUE;
                    shortestPath[i][j] = Long.MAX_VALUE;
                }
            }
        for( int i = 0 ; i<count-1 ; i++) {
            input = sc.nextLine();
            String inputs[] =input.split(" ");
            int a = Integer.valueOf(inputs[0]);
            int b = Integer.valueOf(inputs[1]);
            int c = Integer.valueOf(inputs[2]);
            //System.out.println("a: "+a+" b: "+b);
            graph[a-1][b-1]=c;
            graph[b-1][a-1]=c;
        }

        input = sc.nextLine();
        String inputs2[] = input.split(" ");
        int count2 = Integer.valueOf(inputs2[0]);
        int k = Integer.valueOf(inputs2[1]);

        for(int i = 0 ; i<count2;i++){
            input = sc.nextLine();
            String inputs[] =input.split(" ");
            int a = Integer.valueOf(inputs[0]);
            int b = Integer.valueOf(inputs[1]);
            boolean[] visited = new boolean[count];
           // System.out.println("shortest1: "+ shortest(a-1,k-1,visited));
            // System.out.println("shortest2: "+ shortest(k-1,b-1,visited));
            System.out.println(shortest(a-1,k-1,visited)+shortest(k-1,b-1,visited));
        }
    }

    private static long shortest(int a,int b,boolean[] visited) {
        if(shortestPath[a][b] != Long.MAX_VALUE) {
            return shortestPath[a][b];
        }

        long dist[] = new long[count];
        for(int i= 0 ; i<count ; i++ ) {
            dist[i] = Long.MAX_VALUE;
        }
        for( int i = 0 ;i<count ; i++ )
        {
            visited[a]=true;
            if(graph[a][i]!= Long.MAX_VALUE && visited[i] == false ) {
                long  dist2 = shortest(i,b,visited);
                if(dist2!=Long.MAX_VALUE)
                dist[i] = graph[a][i] + dist2;
            }
            visited[a]=false;
        }
        shortestPath[a][b] =minimum(dist);
        return shortestPath[a][b];
    }

    private static Long minimum (long[] dist) {
        long min = Long.MAX_VALUE;
        for(int i = 0 ; i<count ; i++ ) {
            if( dist[i]<min)
            {
                min = dist[i];
            }
        }
        return min;
    }
}