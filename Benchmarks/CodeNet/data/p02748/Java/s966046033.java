import java.util.*;
public class Main  {
   public static void main(String[] args)  {
      Scanner sc = new Scanner(System.in);
      
      int a = Integer.parseInt(sc.next());
      int b = Integer.parseInt(sc.next());
      int m = Integer.parseInt(sc.next());
      
      int aa[] = new int[a];
      int ab[] = new int[b];
      
      for (int i = 0; i < a; i++) {
         aa[i] = Integer.parseInt(sc.next());
      }
      
      for (int j = 0; j < b; j++) {
         ab[j] = Integer.parseInt(sc.next());
      }
      
      int min = 1000000;
      
      for (int k = 0; k < a; k++) {
         for (int l = 0; l < b; l++) {
            if (aa[k] + ab[l] < min) {
               min = aa[k] + ab[l];
            }
         }   
      }
      
      for (int n = 0; n < m*3; n+=3) {   
         int xa = Integer.parseInt(sc.next());
         int xb = Integer.parseInt(sc.next());
         int xm = Integer.parseInt(sc.next());
            
         int aaa = aa[xa-1];
         int bbb = ab[xb-1];
            
         if (min > (aaa + bbb - xm)) {
            min = (aaa + bbb - xm);
         }
      }
      
      System.out.println(min);
               
   }        
}
