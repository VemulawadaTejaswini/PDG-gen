import java.util.*;
public class Main{
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = Integer.parseInt(sc.nextLine());
      
      int[] arr = new int[n];
      int max = 0;
      
      for(int i = 0; i < n; i ++) {
         arr[i] = Integer.parseInt(sc.nextLine());
      }
      
      for(int i = 0; i < n; i ++) {
         for(int j = i; j < n; j ++) {
            int dif = arr[j] - arr[i];
            if(dif > max) {
               max = dif;
            }
         }
      }
      
      System.out.println(max);
      
   }
}
