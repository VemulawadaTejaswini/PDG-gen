import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{

  public static void main(String[] args) throws IOException
  {
    BufferedReader r = new BufferedReader(new InputStreamReader(System.in), 1);
    String s = r.readLine();
    int n = Integer.parseInt(s);
    String a = r.readLine();
    String b = r.readLine();
    String c = r.readLine();
    int z = 0;
    for(int i = 0; i < n; i++)
    {
      if(a.charAt(i) == b.charAt(i) && a.charAt(i) == c.charAt(i))
      {
        z += 0;
      }
      else if(a.charAt(i) == b.charAt(i) || a.charAt(i) == c.charAt(i) || c.charAt(i) == b.charAt(i))
      {
        z += 1;
      }
      else
      {
        z += 2;
      }
    }

    System.out.println(z);
  }

}
