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
    long n = Long.parseLong(s);

    int a = 0;
    
    for(int i = 1; ; i++)
    {
      long e = z(i);
      if(z(i) > n)
      {
        break;
      }
      String v = Long.toString(e);
      if(v.contains("3") && v.contains("5") && v.contains("7"))
      {
        a++;
      }
    }
    
    System.out.println(a);

  }
  
  public static long z(long d)
  {
    if(d <= 0)
    {
      return 0;
    }
    d -= 1;
    int g = 0;
    long s = 0;
    long v = 1;
    for(int i = 1; i < 100; i++)
    {
      v *= 3;
      s += v;
      if(s - v <= d && d < s)
      {
        g = i;
        break;
      }
    }
    d -= s - v;
    String str = String.format("%0" + g + "d", Long.parseLong(Long.toString(d, 3)));
    int l = str.length();
    long a = 0;
    for(int i = 0; i < l; i++)
    {
      a *= 10;
      switch(str.charAt(i))
      {
        case '0':
          a += 3;
          break;
        case '1':
          a += 5;
          break;
        case '2':
          a += 7;
          break;
      }
    }
    return a;
  }

}