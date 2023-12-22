import java.util.*;
public class Main  {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      String t = sc.next();

      /*for (int i = 0; i < t.length(); i++) {
         if (t.charAt(i) = "?" && t.charAt(i+1) = "D") {
            String t1 = t.substring(i, t.length()).replaceFirst("?", "P");
            String t2 = t.substring(0, i);
            t = "";
            t = t1 + t2;
         }
      }*/
      
      System.out.println(t.replace("?", "D"));
      
      }
      
}
