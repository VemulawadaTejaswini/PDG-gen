import static java.lang.System.out;
import java.util.Scanner;
import java.util.Arrays;

public class Main{
   static Scanner sc = new Scanner(System.in);
   public static void main(String[] args){
      double a = sc.nextDouble();
      double b = sc.nextDouble();
      out.println(Math.ceil((a+b)/2));
      
   }
}