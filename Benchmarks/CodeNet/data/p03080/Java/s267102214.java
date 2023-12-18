import java.util.*;

public class Main{
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int n = sc.nextInt();
      String s = sc.next();

      s = s.replace("B", "");
      int count = s.length();

      if (count > n/2) {
         System.out.println("Yes");
      }
      else {
         System.out.println("No");
      }
   }
}
