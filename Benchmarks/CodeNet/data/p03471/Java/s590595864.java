import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{




  public static void main(String[] args) throws IOException
  {

    class Pochi
    {
      int x = 0;
      int y = 0;
      int z = 0;

      public Pochi(int x, int y, int z)
      {
        this.x = x;
        this.y = y;
        this.z = z;
      }

      public Pochi(boolean f)
      {
        this.x = -1;
        this.y = -1;
        this.z = -1;
      }

      public int getX()
      {
        return x;
      }

      public int getY()
      {
        return y;
      }

      public int getZ()
      {
        return z;
      }

      public boolean fail()
      {
        return x < 0;
      }

      public Pochi search(Pochi cp, int zankin, int paper, int mode)
      {
        Pochi ret = new Pochi(false);
        if(mode == 0) // 10000円札以下
        {
          if(10000 <= zankin && 1 <= paper)
          {
            ret = search(new Pochi(cp.getX() + 1, cp.getY(), cp.getZ()), zankin - 10000, paper - 1, 0);
          }
          if(ret.fail())
          {
            ret = search(cp, zankin, paper, 1);
          }
        }
        else if(mode == 1) // 5000円札以下
        {
          if(5000 <= zankin && 1 <= paper)
          {
            ret = search(new Pochi(cp.getX(), cp.getY() + 1, cp.getZ()), zankin - 5000, paper - 1, 1);
          }
          if(ret.fail())
          {
            ret = search(cp, zankin, paper, 2);
          }
        }
        else // 1000円札以下
        {
          if(zankin == 0 && paper == 0)
          {
            ret = cp;
          }
          else if(1000 <= zankin && 1 <= paper && zankin / paper == 1000)
          {
            ret = search(new Pochi(cp.getX(), cp.getY(), cp.getZ() + paper), 0, 0, 2);
          }
        }
        return ret;
      }
    }

    BufferedReader r = new BufferedReader(new InputStreamReader(System.in), 1);
    String[] sl = r.readLine().split("[\\s]+");
    int paper = Integer.parseInt(sl[0]);
    int yen = Integer.parseInt(sl[1]);

    Pochi p = new Pochi(0, 0, 0);
    Pochi res = p.search(p, yen, paper, 0);


    System.out.printf("%d %d %d", res.getX(), res.getY(), res.getZ());
  }
}
