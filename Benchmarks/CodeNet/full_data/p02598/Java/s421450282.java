import java.util.*;
import java.io.*;
class Main {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int k = sc.nextInt();
      int[] a = new int[n];
      for(int i = 0; i<n; i++)
          a[i] = sc.nextInt();
      int low = 0;
      int high = (int)(1e9);
      int ans = -1;
      while(low<=high) {
          int mid = low + (high-low)/2;
          if(isPossible(a, mid, k)) {
              ans = mid;
              high = mid-1;
          } else low = mid+1;
      }
      System.out.println(ans);
  }
  static boolean isPossible(int[] a, int mid, int k) {
      long x = 0;
      for(int i: a) {
          x+=i/mid;
      }
      return x<=(long)k;
  }
}