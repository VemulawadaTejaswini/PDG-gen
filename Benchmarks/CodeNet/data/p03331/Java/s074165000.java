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
    int min = 987654321;
    for (int i=1; i<=n/2 + 1; i++) {
      int a = i;
      int b = n-i;
      if (a<=0 || b<=0)
        continue;
      int sum = sumDigits(a)+sumDigits(b);
      if (sum<min)
        min = sum;
    }
    System.out.println(min);
  }
  static int sumDigits(int a) {
    int copy = a;
    int sum = 0;
    while (copy>0) {
      sum += copy%10;
      copy/=10;
    }
    return sum;
  }
}
