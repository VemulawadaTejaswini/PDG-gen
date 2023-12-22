import java.util.Scanner;
import java.util.Arrays;
import java.util.Queue;
import java.util.ArrayDeque;



class Main {

    static class aaa {
        public int id;
        public int dis;
    }

    static int n;

    static int[][] graph;

    static int[] d,fin;
 
    static void bfs(int start){
        aaa a,b,c;
        c = new aaa();
        Queue<aaa> queue = new ArrayDeque<aaa>();
        c.id = start;c.dis = 0;
        queue.add(c);

        while(true){
            a = new aaa();
            a = queue.poll();
            //System.out.println(a.id + "  " + fin[a.id]);

            if(a == null)
                break;

            if(fin[a.id] == 1)
                continue;

            d[a.id] = a.dis;

            for(int i = 0;i < graph[a.id].length;i++){
                b = new aaa();
                b.id = graph[a.id][i];b.dis = a.dis + 1;
                if(fin[b.id] == 0){
                    queue.add(b);
                }
            }
            fin[a.id] = 1;
        }
    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        n = input.nextInt();

        graph = new int[n][];
        d = new int[n];
        fin = new int[n];
        for(int i = 0;i < n;i++){
            fin[i] = 0;
            d[i] = -1;
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

        bfs(0);

        for(int i = 0;i < n;i++){
            System.out.println((i + 1) + " " + d[i]);
        }
    }
}