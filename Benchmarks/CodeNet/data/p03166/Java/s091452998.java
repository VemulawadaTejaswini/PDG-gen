import java.util.*;
class Main{
  static Map<Integer,List<Integer>> graph=new HashMap<>();
  static Integer[]cache;
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int e=sc.nextInt();
    for(int i=0;i<e;i++){
      populate(sc.nextInt(),sc.nextInt());
    }
    cache=new Integer[n+1];
    boolean[] visited=new boolean[n+1];
    int ans=0;
    for(int i=1;i<=n;i++){
      if(!visited[i]) ans=Math.max(ans,dfs(i,visited));
    }
    System.out.println(ans);
  }
  public static int dfs(int src,boolean[] visited){
        if(cache[src]!=null) return cache[src];
        visited[src]=true;
        int current=0;
        for(int nei:graph.getOrDefault(src,new ArrayList<>())){
            if(!visited[nei]) current=Math.max(current,dfs(nei,visited));
        }
        return cache[src]=1+current;
    }
    public static void populate(int i,int j){
            graph.putIfAbsent(i,new ArrayList<>());
            graph.get(i).add(j); 
    }
}