import java.util.*;
import java.io.*;

class Main {
    static int INF = 100;
    static int[] list;
    static int a;
    static int b = 1;
    public static void main(String[] args)throws IOException{
      int i,j,n,x,y;
      int Graph[][];
      int depth[];
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(buffer.readLine());
        Graph = new int[n+1][n];
        depth = new int[n+1];

        for(i=0;i<n;i++){
            String[] str = buffer.readLine().split(" ");
            x = Integer.parseInt(str[0]);
            y = Integer.parseInt(str[1]);
            depth[x] = -1;
            for(j=0;j<y;j++){
                Graph[x][j] = Integer.parseInt(str[j+2]);
            }
        }

        depth[1] = 0;
        list = new int[n+1];
        list[0] = 1;

        search(Graph, depth);

        for(i=1;i<=n;i++){
            System.out.println(i + " " + depth[i]);
        }
    }

    public static void search(int[][] Graph, int[] depth){
      int i;
        for(a=0;a<b;a++){
            int fr = list[a];
            for(i=0;i<Graph[fr].length;i++){
                int to = Graph[fr][i];
                if(depth[to] == -1){
                    depth[to] = depth[fr] + 1;
                    list[b++] = to;
                }
            }
        }
    }
}

