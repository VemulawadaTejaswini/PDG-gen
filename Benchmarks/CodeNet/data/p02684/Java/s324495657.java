import java.util.*;

public class Main  {
   public static void main(String[] args)  {
      Scanner sc = new Scanner(System.in);
      
      
      int n = sc.nextInt();
      long k = sc.nextLong();
      
      int a[] = new int[n];
      
      for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
      }
      int where = 1;
               
      for (long j = 0; j < k; j++) {
         where = a[where - 1];
      } 
      
      System.out.println(where);      
   }
}