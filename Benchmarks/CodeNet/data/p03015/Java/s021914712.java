import java.util.*;
import java.io.*;

public class Main
{
  final long mod = (long)1e9+7;  
  char[] L;
  int len, cnt = 0;
  long ans = 0;
  long[] fac, two;
  
  Main(Scanner in, PrintWriter out)
  {
    L = in.next().toCharArray();
    len = L.length;
    for (char c : L)
      if (c == '1')
        cnt++;
    fac = new long[len+1];
    fac[0] = 1;
    for (int i = 1; i <= len; i++)
    {
      fac[i] = i*fac[i-1];
      fac[i] %= mod;
    }
    two = new long[len+1];
    two[0] = 1L;
    for (int i = 1; i <= len; i++)
    {
      two[i] = 2*two[i-1];
      two[i] %= mod;
    }
    
    for (int i = 0; i <= cnt; i++)
    {
      long nck = mult(fac[cnt], mult(exp(fac[i], mod-2), exp(fac[cnt-i], mod-2)));
      ans += mult(nck, two[i]);
      ans %= mod;
    }
    
    out.println(ans);
  }
  
  long exp(long a, long b)
  {
    if (b == 0) return 1L;
    if (b == 1) return a;
    long ans = exp(a, b/2);
    ans *= ans; ans %= mod;
    if ((b & 1) == 0) return ans;
    return (a*ans) % mod;
  }
  
  long mult(long a, long b)
  {
    return a*b % mod;
  }
  
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    PrintWriter out = new PrintWriter(System.out);
    new Main(in, out);
    out.close();
  }
}
