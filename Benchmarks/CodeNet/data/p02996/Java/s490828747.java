import java.util.*;

class Main{
  static Scanner sc = new Scanner(System.in);
  public static void main(String args[]){
    int n = sc.nextInt();
    PriorityQueue<Pair> pq = new PriorityQueue<>(n);
    for(int i=0;i<n;i++){
      Pair pi=new Pair(sc.nextInt(),sc.nextInt());
      pq.add(pi);
    }
    int time=0;
    while(!pq.isEmpty()){
      Pair p=pq.poll();
      if(time+p.a>p.b){
        System.out.println("No");
        return;
      }
      time+=p.a;
    }
    System.out.println("Yes");
  }
  public static class Pair implements Comparable<Pair>{
    int a;
    int b;
    Pair(int a,int b){
      this.a=a;
      this.b=b;
    }
    public int compareTo(Pair o){
      return Integer.compare(this.b,o.b);
    }
  }
}