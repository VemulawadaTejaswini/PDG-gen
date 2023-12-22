import java.util.Scanner;

public class Main{
   public static void main(String[] a){
      Scanner scn = new Scanner(System.in);
      int d = scn.nextInt();
      int b = scn.nextInt();
      int c = scn.nextInt();
      if(c>b&&b>d){
         System.out.println("Yes");
      }else{
         System.out.println("No");
      }
   }
}