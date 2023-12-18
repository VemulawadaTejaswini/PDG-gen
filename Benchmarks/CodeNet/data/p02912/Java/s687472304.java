import java.util.Scanner;
import java.util.PriorityQueue;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt(); //商品の数
    int M = sc.nextInt(); //割引券の数
    PriorityQueue pq = new PriorityQueue();
    
    for(int i=0;i<N;i++){
      int a = sc.nextInt();
      pq.add(-a);
    }
    
    for(int i=0;i<M;i++){
     int new_pd = (int)pq.poll()/2;
      pq.add(new_pd);
    }
    int ans = 0;
    while(!pq.isEmpty()){
      ans -= (int)pq.poll();
    }   
    System.out.println(ans);
  }
}

