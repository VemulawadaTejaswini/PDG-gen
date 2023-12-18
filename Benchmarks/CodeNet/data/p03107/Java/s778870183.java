import java.util.*;
public class Main {
   public static void main(String[] args) {  
      Scanner sc = new Scanner(System.in);
      
      String s = sc.nextLine();
      int zero = 0;
      int one = 0;
      for(int i = 0; i < s.length(); i++) {
         if(s.charAt(i) == '0')
            zero++;
         else
            one++;
      }
      System.out.println(2*Math.min(zero, one));
   }
}