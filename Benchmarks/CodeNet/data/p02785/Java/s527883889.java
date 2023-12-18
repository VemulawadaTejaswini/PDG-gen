import java.util.Arrays;
import java.util.*;
public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      long k = sc.nextLong();
      long[] h = new long[n];
      for(int i=0;i<n;i++){
        h[i] = sc.nextLong();
      }
      long total = 0;
      Arrays.sort(h);
      if(n<=k){
        total = 0;
      }else{
        for(int i=0;i<n-k;i++){
          total += h[i];
        }
      }
      System.out.println(total);
      

    }
}
