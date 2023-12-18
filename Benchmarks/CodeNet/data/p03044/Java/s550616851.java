import java.util.*;

class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    Node[] ns=new Node[n];
    for(int i=0;i<n;i++){
      ns[i]=new Node();
    }
    for(int i=0;i<n-1;i++){
      int u=sc.nextInt()-1;
      int v=sc.nextInt()-1;
      int w=(sc.nextInt()&1);
      ns[u].add(new Edge(v,w));
      ns[v].add(new Edge(u,w));
    }
    Deque<Node> dq=new ArrayDeque<>();
    ns[0].vid=true;
    dq.addLast(ns[0]);
    while(!dq.isEmpty()){
      Node here=dq.pollFirst();
      for(Edge e:here.es){
        if(!ns[e.t].vid){
          ns[e.t].vid=true;
          ns[e.t].color=((here.color+e.l)&1);
          dq.addLast(ns[e.t]);
        }
      }
    }
    for(int i=0;i<n;i++){
      System.out.println(ns[i].color);
    }
  }
  static class Node{
    List<Edge> es=new ArrayList<>();
    int color;
    boolean vid=false;
    void add(Edge e){
      es.add(e);
    }
  }
  static class Edge{
    int t;
    int l;
    Edge(int to,int len){
      t=to;
      l=len;
    }
  }
}