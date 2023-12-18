import java.util.*;

 
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int k = sc.nextInt();
    
    Queue<Long> q = new ArrayDeque<>();
    
    for(long i=1;i<10;i++){
      q.add(i);
    }
    long tmp;
    long x=1;
    
    while(k-- >0){
      x = q.poll();
      tmp = x % 10;
      if(tmp != 0)
        q.add(10*x + tmp -1);
      q.add(10*x+tmp);
      if(tmp != 9)
        q.add(10*x + tmp +1);
    }
    System.out.println(x);
    
  }
}