import java.util.Scanner;
import java.util.Deque;
import java.util.LinkedList;

public class Main {
  public static void main (String[] args) {
    Scanner in = new Scanner(System.in);

    while (in.hasNext()) {
      int N = in.nextInt();
      int[] b = new int[N];
      boolean isPossible = true;

      for (int i = 0; i < b.length; ++i) {
        b[i] = in.nextInt();
        
        if (b[i] > i + 1) {
          isPossible = false;
        }
      }

      if(isPossible == false) {
        System.out.println(-1);
      } else {
        Deque<Integer> stack = new LinkedList<Integer>();
        Deque<Integer> queue = new LinkedList<Integer>();
        
        for (int i = b.length - 1; i >= 0; --i) {
          if (b[i] == 1) {
            System.out.println(1);
            
            while (stack.isEmpty() == false) {
              System.out.println(stack.pop());
            }
  
            while (queue.isEmpty() == false) {
              System.out.println(queue.poll());
            }
          } else {
            if (stack.isEmpty()) {
              stack.push(b[i]);
            } else if (stack.peek() < b[i]) {
              queue.add(b[i]);
            } else {
              stack.push(b[i]);
            }
          }
        }
      }
    }
  }
}