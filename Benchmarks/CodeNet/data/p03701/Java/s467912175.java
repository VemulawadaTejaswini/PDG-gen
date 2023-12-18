import java.io.*;
import java.util.*;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    int[] a1=new int[n];
    int ans = 0;
    
    for(int i=0;i<n;i++){
      a1[i]=sc.nextInt();
    }
    long[] total =new long[n];
    for(int j=0;j<n;j++){
      total[j] = a1[j];
    }
    Arrays.sort(total, Collections.reverseOrder());
    
    for (int k = 0; k < n; k++) {
      if (total[k] % 10 != 0) {
        ans = points[i];
      }
    }
    System.out.println(ans);
  }
}