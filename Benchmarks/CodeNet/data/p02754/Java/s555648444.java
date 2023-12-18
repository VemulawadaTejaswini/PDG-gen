import java.util.*;
public class Main  {
   public static void main(String[] args) throws java.lang.Exception  {
      Scanner sc = new Scanner(System.in);
               
      int n = sc.nextInt();
      int a = sc.nextInt();
      int b = sc.nextInt();
      
      if (a == 0 && b == 0) {
         System.out.println("0");
      } else if (b == 0) {
      
         System.out.println(n);
      
      } else {
      
         int set = n / (a + b);
         int rest = n % (a + b);
         
         int answer = set * a + rest;
         
         System.out.println(answer);
      }
   }        
}
