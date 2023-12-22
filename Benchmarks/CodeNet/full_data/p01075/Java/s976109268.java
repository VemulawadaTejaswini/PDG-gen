import java.util.*;
public class Main{
  Scanner cin = new Scanner(System.in);
  int N,M;
  boolean[] used;
  ArrayList<ArrayList<E>> graph;
  HashMap<Long,Long> map;

  private class E{
    int v,c;
    public E(int v,int c){
      this.v = v;
      this.c = c;
    }
  }
  public long h(int v,int t){
    return v * (long)1e9 + t;
  }
  public long dfs(int v,int t){
    if(v == N - 1){
      return t;
    }
    long hash = h(v,t);
    if(map.containsKey(hash))return map.get(hash);

    if(used[v])return -1;
    used[v] = true;
    long ret = -1;
    for(E e : graph.get(v)){
      if(t <= e.c){
        ret = Math.max(ret,dfs(e.v,e.c));
      }
    }
    used[v] = false;
    map.put(hash,ret);
    return ret;
  }

  public void solve(){
    N = cin.nextInt();
    M = cin.nextInt();
    graph = new ArrayList<ArrayList<E>>();
    for(int i = 0;i < N;i++){
      graph.add(new ArrayList<E>());
    }
    used = new boolean[N];

    for(int i = 0;i < M;i++){
      int a = cin.nextInt() - 1;
      int b = cin.nextInt() - 1;
      int c = cin.nextInt();
      graph.get(a).add(new E(b,c));
    }
    map = new HashMap<Long,Long>();
    System.out.println(dfs(0,0));
  }
  public static void main(String[] args){
    new Main().solve();
  }
}