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
    Double n = Double.parseDouble(sl[0]);
    Double m = Double.parseDouble(sl[1]);
    Double d = Double.parseDouble(sl[2]);

    Double t = 2 * (m - 1) * (n - d) / n / n;

    if(d == 0)
    {
      t /= 2;
    }

   System.out.printf("%.15f", t);
  }
}