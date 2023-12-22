import java.util.Scanner;
import java.util.Arrays;


class Main {
    static int n,time = 1;

    static int[][] graph;

    static int[] d,f,fin;

    static void dfs(int id){
        d[id] = time++;
        for(int i = 0;i < graph[id].length;i++){
            if(fin[graph[id][i]] == 0)
               dfs(graph[id][i]);
        }
        f[id] = time++;
        fin[id] = 1;
    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        n = input.nextInt();

        graph = new int[n][];
        d = new int[n];
        f = new int[n];
        fin = new int[n];
        for(int i = 0;i < n;i++){
            fin[i] = 0;
        }

        for(int i = 0;i < n;i++){
            int u = input.nextInt();
            int k = input.nextInt();
            graph[u - 1] = new int[k];
            for(int j = 0;j < k;j++){
                graph[u - 1][j] = input.nextInt() - 1;
            }
            Arrays.sort(graph[u - 1]);
        }

        while(true){
            int iii;
            for( iii = 0;iii < n;iii++){
                if(fin[iii] == 0){
                    dfs(iii);
                }
            }
            if(iii == n)
                break;
        }
        for(int i = 0;i < n;i++){
            System.out.println((i + 1) + " " + d[i] + " " + f[i]);
        }
    }
}