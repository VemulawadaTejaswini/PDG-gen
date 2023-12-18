import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int H = sc.nextInt();
    int W = sc.nextInt();
    
    if (H%3 == 0 || W%3 ==0) {
      System.out.println(0);
      return;
    }

    long ans = Long.MAX_VALUE;
    for (int i = 1; i <= H-1; i++) {
      long b = (long)W * i;
      long a = (long)(H-i) * (W/2);
      long c = (long)(H-i) * ((W+1)/2);
      long max = Math.max(Math.max(a,b),c);
      long min = Math.min(Math.min(a,b),c);
      long diff = Math.abs(max-min);
      ans = Math.min(ans, diff);
      //System.err.println(i + " " + a + " " + b + " " + c);
    }
    for (int i = 1; i <= W-1; i++) {
      long b = (long)H * i; // 10 5*2
      long a = (long)(W-i) * (H/2); // 6 3*2
      long c = (long)(W-i) * ((H+1)/2); // 9 3*3
      long max = Math.max(Math.max(a,b),c);
      long min = Math.min(Math.min(a,b),c);
      long diff = Math.abs(max-min);
      ans = Math.min(ans, diff);
    }

    System.out.println(ans);
  }
}