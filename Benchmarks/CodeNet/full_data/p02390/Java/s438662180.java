import java.util.Scanner;

public class Main{
   public static void main(String[] a){
      Scanner scn = new Scanner(System.in);
      int time = scn.nextInt();
      System.out.println(time/3600 +":"+ (time%3600)/60 +":"+ time%60);
      
   }
}