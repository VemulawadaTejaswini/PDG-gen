import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Main {
  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);

    int H = scanner.nextInt();
    int W = scanner.nextInt();

    System.out.println(solution(H, W));
    scanner.close();
  }

  private static long solution(int H, int W) {
    if((H%3==0) || (W%3==0)) {
      return 0;
    }

    final long L = Math.max(H, W);
    final long S = Math.min(H, W);

    final long maxArea = S*(L/3+1);
    final long minArea = S*(L/3);

    long min = S;

    for(long i=1;i<S;i++) {
      long j=(long)Math.ceil((double)minArea/i);
      long jMax = Math.min(maxArea/i, L);
      if(0<j && j<jMax) {
        for(;j<jMax;j++) {
          long a = i*j;
          long b = (S-i)*j;
          long c = S*(L-j);
          long thisMin = min(a,b,c);
          long thisMax = max(a,b,c);
          if(thisMax-thisMin<min) min = thisMax-thisMin;
        }
      }
    }
    return min;
  }

  private static long min(long a, long b, long c) {
    return Math.min(a, Math.min(b, c));
  }
  private static long max(long a, long b, long c) {
    return Math.max(a, Math.max(b, c));
  }
}
