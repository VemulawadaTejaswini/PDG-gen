import java.util.*;
public class Main  {
   public static void main(String[] args) throws java.lang.Exception  {
      Scanner sc = new Scanner(System.in);
      
         int n = sc.nextInt();
         int m = sc.nextInt();
         
         int array[] = new int[n];
         
         int preva = 0;
         int prevb = 0;
         int count = 0;
         array[0] = 1;
         
         for (int i = 1; i < n; i++) {
            array[i] = 0;
         }
            
         for  (int j = 0; j < m; j++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
              
            if (preva == a && prevb != b) {
               System.out.println("-1");
               count = 1;
            } else {
               array[a-1] = b;   
            }
            
            preva = a;
            prevb = b;
         }
         
         if (count != 1) {
          for (int k = 0; k < n; k++) {
            System.out.print(array[k]);
          }
         }
        
      }          
   }
