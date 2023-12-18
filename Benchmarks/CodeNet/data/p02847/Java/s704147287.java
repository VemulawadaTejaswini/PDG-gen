import java.util.*;
public class Main {
   public static void main(String[] args) {  
      Scanner sc = new Scanner(System.in);
      
      HashMap<String, Integer> h = new HashMap<String, Integer>();
      
      h.put("SUN", 7);
      h.put("MON", 6);
      h.put("TUE", 5);
      h.put("WED", 4);
      h.put("THU", 3);
      h.put("FRI", 2);
      h.put("SAT", 1);
      
      System.out.println(h.get(sc.nextLine()));
   }
}