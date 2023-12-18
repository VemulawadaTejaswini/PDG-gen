import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int q=sc.nextInt();
    Node[] a = new Node[n];
    for(int i=0;i<n;i++){
      a[i]=new Node();
    }
    for(int i=0;i<n-1;i++){
      a[sc.nextInt()-1].es.add(sc.nextInt()-1);
    }
    for(int i=0;i<q;i++){
      a[sc.nextInt()-1].v+=sc.nextInt();
    }
    Deque<Node> dq = new ArrayDeque<>();
    dq.addFirst(a[0]);
    while(!dq.isEmpty()){
      Node hr=dq.pollFirst();
      for(int t:hr.es){
        a[t].v+=hr.v;
        dq.addFirst(a[t]);
      }
    }
    for(int i=0;i<n-1;i++){
      System.out.print(a[i].v+" ");
    }
    System.out.println(a[n-1].v);
  }
  static class Node{
    int v=0;
    List<Integer> es = new ArrayList<>();
  }
}