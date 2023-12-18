import java.util.*;
  public class Main {
      public static void main(String[] args){
          Scanner sc = new Scanner(System.in);
          int x = sc.nextInt();
          int y = sc.nextInt();
        Map<Integer, Integer> m = new HashMap<>(); 
        m.put(1, 300000);
        m.put(2, 200000);
        m.put(3, 100000);
        int ans = 0; 
        
        ans += m.getOrDefault(x, 0); 
        ans += m.getOrDefault(y, 0);
        if (x == 1 && y==1) { ans += 400000;} 
         
         System.out.println(ans);
     }
 }
