import java.util.*;
public class Main{
  static boolean[] visited;
  static int[] point;
  static List<Integer>[] tree;
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int q = sc.nextInt();
    visited = new boolean[n+1];
    point = new int[n+1];
    tree = new List[n+1];
    for(int i=1;i<=n;i++)tree[i]=new ArrayList<Integer>();
    for(int i=1;i<=n-1;i++){
      int a = sc.nextInt();
      int b = sc.nextInt();
      tree[a].add(b);
      tree[b].add(a);
    }
    for(int i=1;i<=q;i++){
      int p = sc.nextInt();
      int x = sc.nextInt();
      point[p]+=x;
    }
    dfs(1);
    System.out.print(point[1]);
    for(int i=2;i<=n;i++)System.out.print(" "+point[i]);
    System.out.println("");
  }
  public static void dfs(int parent){
    visited[parent]=true;
    for(int child:tree[parent]){
      if(!visited[child]){
        point[child]+=point[parent];
        dfs(child);
      }
    }
  }
}