import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      while(sc.hasNext()) {
         double input = Double.parseDouble(sc.nextLine());
         double height = Math.pow(input,2) / (2.0 * 9.8);
         
         int floor = (int)Math.ceil((height + 5.0) / 5.0);
         System.out.println(floor);
      }
   }
}
