import java.util.*;
public class Main {
   public static void main(String[] args) {  
      Scanner sc = new Scanner(System.in);
      long k = sc.nextLong();
      long ans = Long.MAX_VALUE;
      for(int i = 1; i <= k; i++){
         ans = Math.min(ans,getSum(k*i));
      }
      System.out.println(ans);
   }
   
   public static long getSum(long k){
      if(k / 10 == 0)
         return k;
      return k % 10 + getSum(k/10);
   }
}