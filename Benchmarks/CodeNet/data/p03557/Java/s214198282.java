import java.util.*;
public class Main{

  public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] a = new int[n];
      int[] b = new int[n];
      int[] c = new int[n];

      for(int i = 0; i < n; i++) a[i] = sc.nextInt();
      for(int i = 0; i < n; i++) b[i] = sc.nextInt();
      for(int i = 0; i < n; i++) c[i] = sc.nextInt();

      Arrays.sort(a); Arrays.sort(b); Arrays.sort(c);

      long[] conBC = new long[n];
      for(int i = 0, j = 0; i < n && j < n; i++) {
          int numB = b[i];
          while(j < n && c[j] <= numB)
              j++;
          conBC[i] = n - j;
      }

      long[] prefixSum = new long[n];
      prefixSum[n-1] = conBC[n-1];
      for(int i = n - 2; i >= 0; i--) {
          prefixSum[i] = conBC[i] + prefixSum[i+1];
      }
      long cnt = 0;
      for(int i = 0, j = 0; i < n && j < n; i++) {
          int numA = a[i];
          while(j < n && b[j] <= numA)
              j++;
          if(j < n)
            cnt+= prefixSum[j];
      }

      System.out.println(cnt);
  }
}

