import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static int sum;
    static List<LinkedList<Integer>> graph;
    static boolean[] isVisited;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        graph = new ArrayList<LinkedList<Integer>>();
        isVisited = new boolean[n];
        int s ,t;
        for(int i=0;i<n;i++)graph.add(new LinkedList<>());
        for(int i=0;i<m;i++){
            s = Integer.parseInt(sc.next())-1;
            t = Integer.parseInt(sc.next())-1;
            graph.get(s).add(t);
            graph.get(t).add(s);
        }
        sc.close();
        sum = 0;
        bfs(0,n,0);
        System.out.println(sum);

    }

    public static void bfs(int pos,int n,int v){
        if(pos == n-1){
            sum++;
        }else{
            isVisited[v] = true;
            for(Integer i : graph.get(v)){
                if(!isVisited[i]){
                    bfs(pos+1,n,i);
                }
            }
            isVisited[v] = false;
        }
    }
}