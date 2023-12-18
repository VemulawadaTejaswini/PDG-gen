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
    int m = Integer.parseInt(sl[1]);
    int a = 0;
    
    for(int i = 12000; i >= 1; i--)
    {
      if(m % i == 0 && m / i >= n)
      {
        System.out.println(i);
        System.exit(0);
      }
    }
    
  }

}