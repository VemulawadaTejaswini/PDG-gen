import java.util.*;

public class Main
{
  static int n, w;
  static long[] W;
  static int[] V;
  public static void main(String[] args)
  {
	Scanner in = new Scanner(System.in);
    n = in.nextInt();
    w = in.nextInt();
    W = new long[n];
    V = new int[n];
    for (int i = 0; i < n; i++)
    {
      W[i] = in.nextLong();
      V[i] = in.nextInt();
    }
    
    long[] min = new long[1001];
    Arrays.fill(min, (long)1e9+1);
    min[0] = 0;
    for (int i = 0; i < n; i++)
      for (int v = 1000; v >= 0; v--)
        if (v+V[i] <= 1000)
          min[v+V[i]] = Math.min(min[v+V[i]], min[v]+W[i]);
    
    int best = 1000;
    for ( ; best >= 0; best--)
      if (min[best] <= w)
        break;
    System.out.println(best);        
    in.close();
  }
}
