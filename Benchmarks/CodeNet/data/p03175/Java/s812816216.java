import java.io.BufferedInputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Harry on 4/6/20.
 */
//https://atcoder.jp/contests/dp/tasks/dp_p
public class Main {
    public static long mod = 1000000007;
    public static void main(String[] args){
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        int n = scanner.nextInt();
        List<Integer>[] graph = new List[n+1];
        for(int i=1; i<=n-1; i++){
            int v1 = scanner.nextInt();
            int v2 = scanner.nextInt();
            if(graph[v1]==null){
                graph[v1]=new ArrayList();
            }
            if(graph[v2]==null){
                graph[v2]=new ArrayList();
            }
            graph[v1].add(v2);
            graph[v2].add(v1);
        }
        long[] res = count(1, graph, new boolean[n+1]);
        System.out.print((res[0]+res[1])%mod);
    }

    //white, black
    public static long[] count(int node, List<Integer>[] graph, boolean[] visited){
        long w = 1;
        long b = 1;
        visited[node] = true;
        for(int child : graph[node]){
            if(!visited[child]){
                long[] childRes = count(child, graph, visited);
                b = (b*childRes[0])%mod;
                w =  (w*(childRes[0]+childRes[1]))%mod;
            }
        }
        return new long[]{w,b};
    }
}
