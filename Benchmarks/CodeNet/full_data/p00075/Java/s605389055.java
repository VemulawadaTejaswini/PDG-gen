import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      while(sc.hasNext()) {
         String[] input = sc.nextLine().split(",");
         int num = Integer.parseInt(input[0]);
         double weight = Double.parseDouble(input[1]);
         double height = Double.parseDouble(input[2]);
         double bmi = weight/(height*height);
         if(bmi > 25.0) {
            System.out.println(num);
         }
      }
   }
}
