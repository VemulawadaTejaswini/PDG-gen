import java.util.*;
public class Main  {
   public static void main(String[] args)  {
      Scanner sc = new Scanner(System.in);
      
      int n = sc.nextInt();
      int k = sc.nextInt();
      
      int a[] = new int[n];
      
      for (int h = 0; h < n; h++) {
         a[h] = 0;
      }
      
      for (int i = 0; i < k; i++) {
         int d = sc.nextInt();
         for (int j = 0; j < d; j++) {
            int aa = sc.nextInt();
            a[aa-1] = 1;
         }
      }
      
      int count = 0;
      
      for (int l = 0; l < n; l++) {
         if (a[l] == 0) {
            count++;
         }
      }
      
      System.out.println(count);
   }
}
