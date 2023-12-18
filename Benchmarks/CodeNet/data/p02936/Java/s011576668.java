import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int q=sc.nextInt();
    Node[] ns=new Node[n];
    for(int i=0;i<n;i++){
      ns[i]=new Node();
    }
    for(int i=0;i<n-1;i++){
      int a=sc.nextInt()-1;
      int b=sc.nextInt()-1;
      ns[a].lin.add(ns[b]);
      ns[b].lin.add(ns[a]);
    }
    for(int i=0;i<q;i++){
      int p=sc.nextInt()-1;
      long x=sc.nextInt();
      ns[p].dv+=x;
    }
    Deque<Node> dq=new ArrayDeque<>();
    dq.add(ns[0]);
    ns[0].vid=true;
    while(!dq.isEmpty()){
      Node hr=dq.pollFirst();
      for(Node nx:hr.lin){
        if(nx.vid){
          continue;
        }
        nx.dv+=hr.dv;
        dq.add(nx);
        nx.vid=true;
      }
      hr.v=hr.dv;
    }
    for(int i=0;i<n;i++){
      System.out.println(ns[i].v);
    }
  }
  static class Node{
    List<Node> lin=new LinkedList<>();
    long dv=0;
    long v=0;
    boolean vid=false;
  }
}