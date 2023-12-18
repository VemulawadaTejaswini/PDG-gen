import java.io.*;
import java.util.*;

public class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    /*int n = sc.nextInt();
    int y = sc.nextInt();
    
    if(y % 10000 == 0) {
      System.out.println((y/10000) + " 0 0");
    }
    else if(y % 5000 == 0) {
      System.out.println("0 " + y/5000 + " 0");
    }
    else if(y % 1000 == 0) {
      System.out.println("0 0 " + y/1000);
    }*/
    int n = sc.nextInt();
    long h = sc.nextInt();
    long[] wields = new long[n];
    long[] bato = new long[n];
    long batoSum = 0;
    long ans = 0;
    long maxWield = 0;
    long batoOfMax = 0;
    for(int i = 0; i < n; i++) {
      wields[i] = sc.nextLong();
      bato[i] = sc.nextLong();
      maxWield = Math.max(maxWield, wields[i]);
      if(maxWield == wields[i]) {
        batoOfMax = Math.max(bato[i], batoOfMax);
      }
    }
    long batos = 0;
    Arrays.sort(bato);
    for(int i = n-1; i >= 0; i--) {
      if(bato[i] > maxWield) {
        batoSum += bato[i];
        batos++;
        if(batoSum > h) {
          break;
        }
      }
    }
    if(h > batoSum) {
      ans += Math.ceil(((h-batoSum)/(double)maxWield));
    }
    ans += batos;
    System.out.println(ans);
  }
}