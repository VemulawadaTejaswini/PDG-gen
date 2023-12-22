import java.util.Scanner;

public class Main{
   public static void main(String[] a){
      Scanner scn = new Scanner(System.in);
      int c = scn.nextInt();
      int b = scn.nextInt();
      if(c<b){
          System.out.println("a<b");
      }else if(c == b){
         System.out.println("a=b");
      }else{
         System.out.println("a>b");
      }
   }
}