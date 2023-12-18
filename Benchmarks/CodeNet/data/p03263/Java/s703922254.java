
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
    
    int d = 0;
    int o[][] = new int[255555][4];
    
    for(int i = 0; i < z - 1; i++)
    {
      a[i + 1] += a[i];
      if((a[i] & 1) != 0)
      {
        int t = i / w;
        int tt = i % w;
        int u = (1 + i) / w;
        int uu = (1 + i) % w;
        o[d][0] = 1 + t;
        o[d][1] = 1 + ((t & 1) == 0 ? tt : (w - tt - 1));
        o[d][2] = 1 + u;
        o[d][3] = 1 + ((u & 1) == 0 ? uu : (w - uu - 1));
        d++;
      }
    }
    
    System.out.println(d);

    for(int i = 0; i < d; i++)
    {
      System.out.printf("%d %d %d %d\n", o[i][0], o[i][1], o[i][2], o[i][3]);
    }
    
  }

}
