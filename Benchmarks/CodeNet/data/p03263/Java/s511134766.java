import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{

  public static void main(String[] args) throws IOException
  {
    BufferedReader r = new BufferedReader(new InputStreamReader(System.in), 1);
    String s = r.readLine();
    String[] sl = s.split("[\\s]+");
    int h = Integer.parseInt(sl[0]);
    int w = Integer.parseInt(sl[1]);

    int z = h * w;
    
    int[] a = new int[255555];
    
    for(int i = 0; i < h; i++)
    {
      s = r.readLine();
      sl = s.split("[\\s]+");

      if((i & 1) == 0)
      {
        for(int j = 0; j < w; j++)
        {
          a[w * i + j] = Integer.parseInt(sl[j]);
        }
      }
      else
      {
        for(int j = 0; j < w; j++)
        {
          a[w * (i + 1) - j - 1] = Integer.parseInt(sl[j]);
        }
      }
    }
    
    int c = 0;
    
    for(int i = 0; i < z - 1; i++)
    {
      a[i + 1] += a[i];
      c += (a[i] & 1);
    }

    System.out.println(c);
    
    for(int i = 0; i < z - 1; i++)
    {
      if((a[i] & 1) != 0)
      {
        int t = i / w;
        int tt = i % w;
        int u = (1 + i) / w;
        int uu = (1 + i) % w;
        System.out.printf("%d %d %d %d\n", 1 + t, 1 + ((t & 1) == 0 ? tt : (w - tt - 1)), 
            1 + u, 1 + ((u & 1) == 0 ? uu : (w - uu - 1)));
      }
    }

  }

}