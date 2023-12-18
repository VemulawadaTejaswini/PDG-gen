import java.util.*;
public class Main  {
   public static void main(String[] args) throws java.lang.Exception  {
      Scanner sc = new Scanner(System.in);
      
      int  m = sc.next();
      int  n = sc.next(); 
      
      int mm = m*(m-1)/2;
      int nn = n*(n-1)/2;
      int answer = mm + nn;
      System.out.println(answer);
   }        
}