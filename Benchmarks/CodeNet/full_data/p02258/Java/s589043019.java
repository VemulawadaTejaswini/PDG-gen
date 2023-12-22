import java.util.*;
public class Main{
   public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   
   int n = Integer.parseInt(sc.nextLine());
   int[] arr = new int[n];
   
   for(int i = 0; i < n; i ++) {
      arr[i] = Integer.parseInt(sc.nextLine());
   }
   
   int min = arr[0];
   int maxP = arr[1] - arr[0];
   
   for(int i = 1; i < n; i ++) {
      int dif = arr[i] - min;
      if(dif > maxP) {
         maxP = dif;  
      }
      if(arr[i] < min) {
         min = arr[i];
      }
   }
   
   System.out.println(maxP);
    
   }//main
}
