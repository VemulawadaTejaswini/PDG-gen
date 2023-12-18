import java.util.*;
public class Main  {
   public static void main(String[] args) throws java.lang.Exception  {
      Scanner sc = new Scanner(System.in);
               
      int n = sc.nextInt();
      int a = sc.nextInt();
      int b = sc.nextInt();
      
      int set = n / (a + b);
      int rest = n % (a + b);
      
      int answer = set * a + rest;
      
      System.out.println(answer);
      
   }        
}