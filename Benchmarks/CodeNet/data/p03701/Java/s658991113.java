/**
 * @author Finn Lidbetter
 */
import java.util.*;
import java.io.*;
import java.awt.geom.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    String[] s = br.readLine().split(" ");
    int n = Integer.parseInt(s[0]);
    long a = Integer.parseInt(s[1]);
    long b = Integer.parseInt(s[2]);

    long[] arr = new long[n];
    
    long sum = 0;
    for (int i=0; i<n; i++) {
      arr[i] = Long.parseLong(br.readLine());
      sum += arr[i];
    }
    long diff = a-b;
    long lo = 1; 
    long hi = (long)(1e9+1);
    long result = -1;
    while (lo<hi) {
      long mid = lo + (hi-lo)/2;
      boolean good = isGood(mid, arr,a,b);
      if (good) {
        result = mid;
        hi = mid-1;
      } else {
        lo = mid+1;
      }
    }
    long mid = lo + (hi-lo)/2;
    boolean good = isGood(mid, arr,a,b);
    if (good)
      result = mid;
    System.out.println(result);
  }
  static boolean isGood(long k, long[] arr, long a, long b) {
    long offset = k*b;
    long diff = a-b;
    long nCentres = 0;
    int n = arr.length;
    for (int i=0; i<n; i++) {
      long rem = arr[i]-offset;
      if (rem>0) {
        nCentres += rem/diff + ((rem%diff==0) ? 0 : 1);
      }
    }
    return nCentres<=k;
  }
}
