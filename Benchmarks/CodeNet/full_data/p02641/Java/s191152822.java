import java.util.*;
public class Main  {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int x = sc.nextInt();
      int n = sc.nextInt();
      
      if (n == 0) {
         System.out.println(x);
      } else {
         int a[] = new int[n];

         for (int i = 0; i < n; i++) {
            int aa = sc.nextInt();
            a[i] = aa;
         }

         Arrays.sort(a);
      
         int last = a[n-1];
      
         int b[] = new int[last];
      
         for (int j = 0; j < n; j++) {
            b[j] = 0;
         }
      
         for (int k = 0; k < n; k++) {
            int aaa = a[k];
            b[aaa-1] = 1;
         }
      
         if (b[x] == 0) {
            System.out.println(x);
         } else {
            int fin = 0;
            int count = 1;
            while (fin == 0) {
               if (b[x-count-1] == 0) {
                  System.out.println(x-count);
                  fin++;
               } else if (fin == 0 && b[x + count-1] == 0) {
                  System.out.println(x+count);
                  fin++;
               }
               count++;
            }
         }
      }
   }
}