
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{

  public static void main(String[] args) throws IOException
  {
    BufferedReader r = new BufferedReader(new InputStreamReader(System.in), 1);
    String s;
    String[] sl;

    s = r.readLine();
    sl = s.split(" ");
    long n = Integer.parseInt(sl[0]);
    long m = Integer.parseInt(sl[1]);

    s = r.readLine();
    String t = r.readLine();

    long v = gcd(n, m);
    long z = n * m / v;
    for(long i = 0; i < n * m; i += z)
    {
      if(s.charAt((int)(i / m)) != t.charAt((int)(i / n)))
      {
        //System.out.println(i);
        System.out.println("-1");
        System.exit(0);
      }
    }

    System.out.println(z);

  }


  public static long gcd(long n, long m)
  {
    long t;
    if(n < m)
    {
      t = n;
      n = m;
      m = t;
    }

    while(m != 0)
    {
      n %= m;
      t = n;
      n = m;
      m = t;
    }

    return n;
  }

}