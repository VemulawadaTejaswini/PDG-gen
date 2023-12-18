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

    String[] s= br.readLine().split(" ");
    int n = Integer.parseInt(s[0]);
    int k = Integer.parseInt(s[1]);
    s = br.readLine().split(" ");
    int v1 = Integer.parseInt(s[0]);
    int gcd = v1;
    int max = v1;
    for (int i=1; i<n; i++) {
      int v = Integer.parseInt(s[i]);
      gcd = gcd(gcd, v);
      if (v>max)
        max = v;
    }
    if (k>max || k%gcd!=0) {
      System.out.println("IMPOSSIBLE");
    } else {
      System.out.println("POSSIBLE");
    }
  }
  static int gcd(int a, int b) {
    return (b==0) ? a : gcd(b, a%b);
  }
}
