import java.util.Scanner;
import java.util.Deque;
import java.util.ArrayDeque;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
	Deque<Integer> deque = new ArrayDeque<Integer>();
    
    if(n % 2 == 1){
      for(int i = 0; i < n; i++){
          if(i % 2 == 0)
            deque.addFirst(sc.nextInt());
          else
            deque.addLast(sc.nextInt());
      }
    }else{
      for(int i = 0; i < n; i++){
        if(i % 2 == 1)
            deque.addFirst(sc.nextInt());
          else
            deque.addLast(sc.nextInt());
      }
    }
  
    while(deque.size() > 0) System.out.printf("%d ", deque.remove());
  } 
}