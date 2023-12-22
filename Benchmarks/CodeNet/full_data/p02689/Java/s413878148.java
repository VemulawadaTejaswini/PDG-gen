import java.util.*;
public class Main  {
   public static void main(String[] args)  {
      Scanner sc = new Scanner(System.in);
      
      int n = sc.nextInt();
      int m = sc.nextInt();
      
      int a[] = new int[n];
      
      int b[] = new int[n];
      
      for (int g = 0; g < n; g++) {
         a[g] = sc.nextInt();
      }
      
      for (int h = 0; h < n; h++) {
         b[h] = 0;
      }
      
      for (int i = 0; i < m; i++) {
         int x = sc.nextInt();
         int y = sc.nextInt();
         if (a[x-1] >= a[y-1]) {
            b[y-1] = 1;
         } else {
            b[x-1] = 1;
         }
      }
      
      int count = 0;
      
      for (int l = 0; l < n; l++) {
         if (b[l] == 0) {
            count++;
         }
      }
      
      System.out.println(count);
   }
}
