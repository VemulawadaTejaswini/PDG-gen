import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String s = sc.nextLine();
      String p = sc.nextLine();
      
      String check = s + s.substring(0,p.length());
      if(check.contains(p)) {
         System.out.println("Yes");
      } else {
         System.out.println("No");
      }
   }
}
