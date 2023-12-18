
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{
  public static long a[] = new long[51];
  public static long b[] = new long[51];
  public static void main(String[] args) throws IOException
  {
    BufferedReader r = new BufferedReader(new InputStreamReader(System.in), 1);

    String s;
    String sl[];

    s = r.readLine();
    sl = s.split(" ");
    int n = Integer.parseInt(sl[0]);
    long x = Long.parseLong(sl[1]);
    a[0] = 1;
    b[0] = 1;
    for(int i = 0; i < 50; i++)
    {
      a[i + 1] = 3 + 2 * a[i];
      b[i + 1] = 1 + 2 * b[i];
    }

    System.out.println(cal(n, x));

  }

  public static long cal(int n, long x)
  {
    if(n == 0)
    {
      return x > 0 ? 1 : 0;
    }

    if(x <= 1)
    {
      return 0;
    }
    if(x >= a[n] - 1)
    {
      return b[n];
    }
    if(x == a[n - 1] + 1)
    {
      return b[n - 1];
    }
    if(x == a[n - 1] + 2)
    {
      return b[n - 1] + 1;
    }



    if(x <= a[n - 1] + 1)
    {
      return cal(n - 1, x - 1);
    }
    else
    {
      return cal(n - 1, x - a[n - 1] - 2) + b[n - 1] + 1;
    }
  }

}