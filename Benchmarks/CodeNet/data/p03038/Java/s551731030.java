import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main
{
  static long y[];
  static int n;
  static int m;
  public static void main(String[] args) throws IOException
  {
    BufferedReader r = new BufferedReader(new InputStreamReader(System.in), 1);
    String sl[];


    sl = r.readLine().split(" ");
    n = Integer.parseInt(sl[0]);
    m = Integer.parseInt(sl[1]);

    Integer v[] = new Integer[n + m];
    y = new long[n + m];

    long a[] = new long[n];
    int b[] = new int[m];
    long c[] = new long[m];

    sl = r.readLine().split(" ");
    for(int i = 0; i < n; i++)
    {
      v[i] = i;
      a[i] = Long.parseLong(sl[i]);
      y[i] = a[i];
    }

    for(int i = 0; i < m; i++)
    {
      sl = r.readLine().split(" ");
      b[i] = Integer.parseInt(sl[0]);
      c[i] = Integer.parseInt(sl[1]);
      v[i + n] = i + n;
      y[i + n] = c[i];
    }

    class Comp implements Comparator<Integer>
    {
      @Override
      public int compare(Integer o1, Integer o2)
      {
        if(y[o1] > y[o2])
          return -1;
        else if(y[o1] < y[o2])
          return 1;
        return 0;
      }
    }

    Arrays.sort(v, new Comp());

    long cc = 0;
    int pp = -1;
    int vv = 0;
    int dd = 0;
    while(dd < n)
    {
      if(vv == 0)
      {
        pp++;
        if(v[pp] < n)
        {
          vv = 1;
        }
        else
        {
          vv = b[v[pp] - n];
        }
      }
      
      dd++;
      vv--;
      cc += y[v[pp]];
    }
    
    System.out.println(cc);
    
  }

}