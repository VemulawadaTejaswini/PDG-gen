import java.util.*;
import java.util.stream.*; 

public class Main {

    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int num = scanner.nextInt();
      int ticket = scanner.nextInt();
      
      LinkedList<Integer> prices = new LinkedList<Integer>();
     
      for (int i = 0; i < num; i++) {
        prices.add(scanner.nextInt());
      }
      Collections.sort(prices, Collections.reverseOrder());
      
      while (ticket > 0) {
        prices.set(0, prices.get(0) / 2);
        //System.out.println(prices.get(0));
        SwapInOrder(prices);
        //System.out.println("swap: " + prices.get(0));
      	ticket--;
      }
      
      int sum = 0;
       for (Integer i : prices) {
         sum += i; // etc
      }
      System.out.println(sum);
    }
  	
  	public static void SwapInOrder(LinkedList<Integer> prices) {
      ListIterator<Integer> it = prices.listIterator();
      if (it.hasNext()) 
        it.next();
      
      while (it.hasNext()) {
        Integer thing = (Integer)it.next();
        if (prices.get(0) > thing) {
          it.previous();
          it.add(prices.get(0));
          prices.removeFirst();  
          break;
    	}
      }
    }
}
