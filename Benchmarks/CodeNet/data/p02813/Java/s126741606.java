import java.util.*;
public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int n = sc.nextInt();

      int[] p = new int[n];
      for (int i = 0; i < p.length; i++) {
         p[i] = sc.nextInt();
      }

      int[] q = new int[n];
      for (int i = 0; i < q.length; i++) {
         q[i] = sc.nextInt();
      }

      int a = 0;
      int b = 0;

      int c = 0;

      int e = 1;
      for(int i = 1; i <= p.length-1; i++){
         e = e * i;
      }
      a = (p[0] - 1) * e;

      for(int j = 1; j < p.length-2; j++){
         c = 0;
         for (int i = j+1; i < p.length; i++) {
            if(p[j] > p[i]){
               c = c + 1;
            }
         }
         e = 1;
         for(int i = 1; i <= p.length-j-1; i++){
            e = e * i;
         }
         a = a + c * e; 
      }

      if(p[p.length-2] < p[p.length-1]){
         a = a + 1;
      }
      else{
         a = a + 2;
      }


      e = 1;
      for(int i = 1; i <= q.length-1; i++){
         e = e * i;
      }
      b = (q[0] - 1) * e;

      for(int j = 1; j < q.length-2; j++){
         c = 0;
         for (int i = j+1; i < q.length; i++) {
            if(q[j] > q[i]){
               c = c + 1;
            }
         }
         e = 1;
         for(int i = 1; i <= q.length-j-1; i++){
            e = e * i;
         }
         b = b + c * e; 
      }
      if(q[q.length-2]<q[q.length-1]){
         b = b + 1;
      }
      else{
         b = b + 2;
      }
      System.out.println(Math.abs(a-b));

   }
}