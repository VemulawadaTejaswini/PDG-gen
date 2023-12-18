import java.util.*;
import java.io.*;

public class Main
{
  int n, max = 0;
  int[] a, l, r;
  
  Main(Scanner in, PrintWriter out)
  {
    n = in.nextInt();
    a = new int[n];
    l = new int[n+1];
    r = new int[n+1];
    for (int i = 0; i < n; i++)
      a[i] = in.nextInt();
    for (int i = 1; i <= n; i++)
      l[i] = gcd(a[i-1], l[i-1]);
   	for (int i = n-1; i >= 0; i--)
      r[i] = gcd(a[i], r[i+1]);
    for (int i = 0; i < n; i++)
      max = Math.max(max, gcd(l[i], r[i+1]));
    out.println(max);
  }
  
  int gcd(int a, int b)
  {
    return b == 0 ? a : gcd(b, a%b);
  }
  
  public static void main(String[] args)
  {
	Scanner in = new Scanner(System.in);
    PrintWriter out = new PrintWriter(System.out);
    new Main(in, out);
    out.close();
  }
}
