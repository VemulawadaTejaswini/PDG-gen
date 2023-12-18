import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int X = sc.nextInt();
    int Y = sc.nextInt();
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();
    long answer =0;
    //それぞれの幸福度をゆうせんど付きキューに入れて管理
    Queue<Long> p = new PriorityQueue<Long>(Collections.reverseOrder());
    Queue<Long> q = new PriorityQueue<Long>(Collections.reverseOrder());
    Queue<Long> r = new PriorityQueue<Long>(Collections.reverseOrder());
    Queue<Long> N = new PriorityQueue<Long>(Collections.reverseOrder());
    
    for(int i=0;i<A;i++){
      p.add(sc.nextLong());
    }
    for(int i=0;i<B;i++){
      q.add(sc.nextLong());
    }    
    for(int i=0;i<C;i++){
      r.add(sc.nextLong());
    }
    for(int i=0;i<X;i++){
      N.add(p.poll());
    }
    for(int i=0;i<Y;i++){
      N.add(q.poll());
    }
    for(int i=0;i<C;i++){
      N.add(r.poll());
    }
    for(int i=0;i<X+Y;i++){
      answer = answer + N.poll();
    }
    System.out.println(answer);
  }
  

  
}