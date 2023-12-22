import java.util.*;

class Main{
  static Scanner sc=new Scanner(System.in);
  static int iMax=Integer.MAX_VALUE;
  static int n;
  static Node[] ns;
  static int[] dp;
  public static void main(String[] args){
    n=sc.nextInt();
    ns=Node.scan(n);
    for(int i=0;i<n-1;i++){
      int a=sc.nextInt()-1;
      int b=sc.nextInt()-1;
      ns[a].add(ns[b]);
      ns[b].add(ns[a]);
    }
    dp=new int[n+2];
    Arrays.fill(dp,iMax);
    dp[0]=0;
    calc(ns[0]);
    Node.printAns(ns);
  }
  static void calc(Node hr){
    int aaa=bs(dp,hr.v);
    int tmp=dp[aaa+1];
    dp[aaa+1]=Integer.min(hr.v,dp[aaa+1]);
    hr.ans=bs(dp,iMax);
    for(Node nx:hr.lin){
      if(nx.ans==0){
        calc(nx);
      }
    }
    dp[aaa+1]=tmp;
  }
  static class Node{
    int id;
    int v;
    int ans=0;
    List<Node> lin=new ArrayList<>();
    Node(int id,int v){
      this.id=id;
      this.v=v;
    }
    void add(Node n){
      lin.add(n);
    }
    static Node[] scan(int n){
      Node[] res=new Node[n];
      for(int i=0;i<n;i++){
        res[i]=new Node(i,sc.nextInt());
      }
      return res;
    }
    static void printAns(Node[] a){
      for(int i=0;i<a.length;i++){
        System.out.println(a[i].ans);
      }
    }
  }
  static int bs(int[] a,int key){
    int ok=-1;
    int ng=a.length;
    while(ng-ok>1){
      int gaze=ok+(ng-ok)/2;
      if(a[gaze]<key){
        ok=gaze;
      }else{
        ng=gaze;
      }
    }
    return ok;
  }
}