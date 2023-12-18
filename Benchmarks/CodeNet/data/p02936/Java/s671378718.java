import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int Q = sc.nextInt();

    List[] ed = new ArrayList[N];
    for (int i = 0; i < N; i++) {
      ed[i] = new ArrayList(20000);
    }

    for (int i = 0; i < N-1; i++) {
      int a = sc.nextInt()-1;
      int b = sc.nextInt()-1;
      ed[a].add(b);
      ed[b].add(a);
    }

    int[] q = new int[N];
    for (int i = 0; i < Q; i++) {
      int p = sc.nextInt();
      int x = sc.nextInt();
      q[p-1] += x;
    }

    dfs(q,ed,0,0,-1);

    for (int i = 0; i < q.length; i++) {
      System.out.print(q[i] + (i!=(q.length-1)?" ":"\n"));
    }

  }

  static void dfs(int[] q, List[] edges, int node, int val,int p){

    q[node]+=val;
    List<Integer> edge = edges[node];
    for (int child: edge) {
      if(child == p) continue;
      dfs(q,edges,child,q[node],node);
    }

  }

}