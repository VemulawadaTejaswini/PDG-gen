import java.util.*;
import java.util.stream.*; 

public class Main {

    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int num = scanner.nextInt();
      int ticket = scanner.nextInt();
      
      PriorityQueue<Integer> prices 
        = new PriorityQueue<Integer>(num, Collections.reverseOrder());
     
      for (int i = 0; i < num; i++) {
        prices.add(scanner.nextInt());
      }
      
      while (ticket > 0) {
        Integer p = prices.poll(); 
        prices.add(p / 2);
      	ticket--;
      }
      
      int sum = 0;
       for (Integer i : prices) {
         sum += i; // etc
      }
      System.out.println(sum);
    }
}
