import java.util.Arrays;
import java.util.*;
public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] p = new int[n];
      int i;
      int total = 0;
      for(i=0;i<n;i++){
        p[i] = sc.nextInt();
      }
      Arrays.sort(p);
      p[n-1] = p[n-1]/2;
      for(i=0;i<n;i++){
        total = total + p[i];
      } 
      System.out.println(total);
  }
}
