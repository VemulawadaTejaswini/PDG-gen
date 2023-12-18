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

    int d = Integer.parseInt(sl[0]);
    int n = Integer.parseInt(sl[1]);
    
    n += (n == 100 ? 1 : 0);
    
    for(int i = d; i > 0; i--)
    {
      n *= 100;
    }
    
    System.out.println(n);

  }

}