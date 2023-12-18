import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{

  public static void main(String[] args) throws IOException
  {
    BufferedReader r = new BufferedReader(new InputStreamReader(System.in), 1);

    String s;
    String sl[];

    int n = Integer.parseInt(r.readLine());

    sl = r.readLine().split(" ");

    int a[] = new int[400400];

    int h = 200200;
    int t = 200201;

    boolean f = false;

    for(int i = 0; i < n; i++)
    {
      if(f)
      {
        a[t++] = Integer.parseInt(sl[i]);
      }
      else
      {
        a[h--] = Integer.parseInt(sl[i]);
      }
      f = !f;
    }



    if(!f)
    {
      for(int i = t - 1; i > h; i--)
      {
        System.out.printf("%d ", a[i]);
      }
    }
    else
    {
      for(int i = h + 1; i < t; i++)
      {
        System.out.printf("%d ", a[i]);
      }
    }

  }

}