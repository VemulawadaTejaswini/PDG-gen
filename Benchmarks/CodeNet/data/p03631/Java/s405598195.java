import java.util.Scanner;
public class Main{
   public static void main(String[]args){
      Scanner sc = new Scanner(System.in);
      int nh = sc.nextInt();
      String n = Integer.toString(nh);
      String a = n.substring(0,1);
      String b = n.substring(n.length()-1);
      if(a ==b){
         System.out.println("Yes");
      }else{
         System.out.println("No");
      }
      
   }  
}