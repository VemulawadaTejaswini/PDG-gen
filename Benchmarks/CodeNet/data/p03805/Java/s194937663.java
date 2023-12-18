import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Graph[] graphs = new Graph[m];
        for(int i = 0;i < m;++i){
            graphs[i] = new Graph(sc.nextInt(),sc.nextInt());
        }
        boolean flags[] = new boolean[n];
        flags[0] = true;
        System.out.println(search(graphs,flags,1));
    }

    public static int search(Graph[] graphs,boolean[] passed,int now){
        int se = 0;
        int k = 0;
        for (boolean b:passed){
            if(b)++k;
        }
        if(k == passed.length)return 1;
        for (Graph graph:graphs){
            if(graph.start == now){
                if(!passed[graph.end - 1]){
                    boolean ps[] = passed.clone();
                    ps[graph.end - 1] = true;
                    se += search(graphs,ps,graph.end);
                }
            }
            else if(graph.end == now){
                if(!passed[graph.start - 1]){
                    boolean ps[] = passed.clone();
                    ps[graph.start - 1] = true;
                    se += search(graphs,ps,graph.start);
                }
            }
        }
        return se;
    }

    public static class Graph{
        int start,end;
        public Graph(int start,int end){
            this.start = start;
            this.end = end;
        }
    }


}