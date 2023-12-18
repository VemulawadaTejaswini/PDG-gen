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
    String[] s = br.readLine().split(" ");
    int[] arr = new int[n];
    for (int i=0; i<n; i++) {
      arr[i] = Integer.parseInt(s[i])-(i+1);
    }
    Arrays.sort(arr);
    int med = arr[n/2];
    long sum = 0;
    for (int i=0; i<n; i++) {
      sum += (long)(Math.abs(arr[i]-med));
    }
    System.out.println(sum);
    /*
    long best = Long.MAX_VALUE;
    while (lo<=hi) {
      int mid = lo + (hi-lo)/2;
      long sum = 0;
      for (int i=0; i<n; i++) {
        sum += (long)(Math.abs(arr[i]-mid));
      }
      if (sum<best) {
        best = sum;
      }
      if ()
    }
    */
  }
}
