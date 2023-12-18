import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{




  public static void main(String[] args) throws IOException
  {

    BufferedReader r = new BufferedReader(new InputStreamReader(System.in), 1);
    String[] sl = r.readLine().split("[\\s]+");
    int paper = Integer.parseInt(sl[0]);
    int yen = Integer.parseInt(sl[1]);

    int x, y, z;
    for(x = 0; 10000 * x <= yen && x <= paper; x++)
    {
      int newy = yen - 10000 * x;
      int newp = paper - x;
      int tmp = 5000 * newp - newy;
      if((tmp / 4000) * 4000 == tmp)
      {
        z = tmp / 4000;
        y = newp - z;
        if(y >= 0 && z >= 0)
        {
          System.out.printf("%d %d %d\n", x, y, z);
          System.exit(0);
        }
      }
    }

    System.out.println("-1 -1 -1");
  }
}
