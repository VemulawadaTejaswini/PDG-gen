
import java.util.*;
import java.util.stream.Stream;

public class Main {
    static int[][] graph;
    static int[] check;
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        graph = new int[N+1][N+1];
        for (int i = 0; i < M; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            graph[x][y] = 1;
            //graph[y][x] = -1;
        }
        sc.close();
        check = count_node(graph);
        fix_graph_num1();
        //dump(graph);

        int sum = Arrays.stream(check).sum();
        if(sum%2==1){
            System.out.println(-1);
            return;
        }

        int ch = 0;
        while(ch>=0){
            ch = check_search();
            fix_graph_num1();
        }
        output();

    }

    public static void output() {
        for(int i=0;i<graph.length;i++){
            for(int j=0;j<graph.length;j++){
                if(graph[i][j]==1){
                    System.out.println(i + " " + j);
                }
            }
        }
    }

    public static int check_search() {
        int res = -1;
        for(int i=0;i<check.length;i++){
            if(check[i]%2 == 1){
                res = i;
                break;
            }
        }
        return res;
    }

    public static int[] count_node(int[][] g) {
        int[] res = new int[g.length];
        for(int i=0;i<g.length;i++){
            for (Integer var : g[i]) {
                if(var < 0)continue;
                res[i] += var;
            }
        }
        return res;
    }


    public static void fix_graph_divided() {
        for(int i=0;i<graph.length;i++){
            if(check[i]%2==1){
                for(int j=0;j<graph.length;j++){
                    if(graph[i][j]==1){
                        graph[i][j]=0;
                        graph[j][i]=1;
                        check[i]--;
                        check[j]++;
                    }
                }
            }
        }
    }

    public static void fix_graph_num1() {
        for(int i=0;i<graph.length;i++){
            if(check[i]==1){
                for(int j=0;j<graph.length;j++){
                    if(graph[i][j]==1){
                        graph[i][j]=0;
                        graph[j][i]=1;
                        check[i]--;
                        check[j]++;
                    }
                }
            }
        }
    }

    public static void dump(int[][] a) {
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }
}