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
    
    int n = Integer.parseInt(br.readLine());
    long[] arr = new long[n+1];
    String[] s = br.readLine().split(" ");
    for (int i=0; i<n; i++) {
      arr[i+1] = Long.parseLong(s[i])+arr[i];
    }

    long best = 987654321987654321L;
    for (int i=2; i<n-1; i++) {
      long[] left = solve(arr, 0, i);
      long[] right = solve(arr, i, n);
      //System.out.println("i="+i);
      //System.out.println("Left: "+Arrays.toString(left));
      //System.out.println("Right: "+Arrays.toString(right));
      long diff = Math.max((long)Math.abs(Math.min(left[0],left[1])-Math.max(right[0],right[1])), (long)Math.abs(Math.max(left[0],left[1])-Math.min(right[0],right[1])));
      if ((long)Math.abs(left[1]-left[0])>diff) {
        diff = (long)Math.abs(left[1]-left[0]);
      }
      if ((long)Math.abs(right[1]-right[0])>diff) {
        diff = (long)Math.abs(right[1]-right[0]);
      }
      //System.out.println("Diff: "+diff);
      if (diff<best)
        best = diff;
    }
    System.out.println(best);
  }
  static long[] solve(long[] arr, int minIndex, int maxIndex) {
    int lo = 1;
    int hi = maxIndex;
    int best = -1;
    long bestDiff = 987654321987654321L;
    long target = arr[minIndex] + (arr[maxIndex]-arr[minIndex])/2;
    while (lo<=hi) {
      int mid = lo+(hi-lo)/2;
      if (arr[mid]<target) {
        if (target-arr[mid]<bestDiff) {
          bestDiff = target-arr[mid];
          best = mid;
        }
        lo = mid +1;
      } else {
        if (arr[mid]-target<bestDiff) {
          bestDiff = arr[mid]-target;
          best = mid;
        }
        hi = mid-1;
      }
    }
    return new long[]{arr[best]-arr[minIndex], arr[maxIndex]-arr[best]};
  }
}
