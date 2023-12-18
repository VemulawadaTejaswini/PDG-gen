import java.util.Scanner;
import java.util.Deque;
import java.util.ArrayDeque;


class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
	Deque<Integer> deque = new ArrayDeque<Integer>();
    for(int i = 0; i < n; i++){
      	if(i % 2 == 0)
          deque.addFirst(sc.nextInt());
      	else
          deque.addLast(sc.nextInt());
    }
  
    while(deque.size() > 0){
      if(n % 2 == 0)
        System.out.printf("%d ", deque.removeLast());
      else
        System.out.printf("%d ", deque.remove());
    }
  } 
}