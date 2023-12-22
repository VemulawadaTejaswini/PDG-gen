import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      double max = 0.0;
      double min = 1000000.0;
      
      while(sc.hasNext()) {
         double height = Double.parseDouble(sc.nextLine());
         if (height > max) {
            max = height;
         }
         if (height < min) {
            min = height;
         }
      }
      
      System.out.println(max - min);
   }
}
