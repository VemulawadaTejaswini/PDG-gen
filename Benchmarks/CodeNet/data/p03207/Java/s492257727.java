
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

    s = r.readLine();
    sl = s.split(" ");
    int n = Integer.parseInt(sl[0]);
    int max = 1;
    int sum = 0;


    for(int i = 0; i < n; i++)
    {
      s = r.readLine();
      int v = Integer.parseInt(s);
      sum += v;
      max = Math.max(v, max);
    }

    System.out.println(sum - max / 2);

  }

}