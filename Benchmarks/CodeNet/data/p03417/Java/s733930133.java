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
    long a = Long.parseLong(sl[0]);
    long b = Long.parseLong(sl[1]);
    if (b < a)
    {
      long t = a;
      a = b;
      b = t;
    }
    
    if(a == 1)
    System.out.println(b == 1 ? 1 : b - 2);
    else if(a == 2)
      System.out.println(0);
    else
      System.out.println((a - 2) * (b - 2));
  }
  
}