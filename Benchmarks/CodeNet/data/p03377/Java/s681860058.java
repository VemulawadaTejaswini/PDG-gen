
import java.io.*;

public class Main {
  
  public static void main(String[] args) throws IOException
  {
    BufferedReader r = new BufferedReader(new InputStreamReader(System.in), 1);
    String s = r.readLine();
    String sl[] = s.split(" ");
    int a = Integer.parseInt(sl[0]);
    int b = Integer.parseInt(sl[1]);
    int x = Integer.parseInt(sl[2]);
    if(a <= x && x <= a + b)
    {
      System.out.println("YES");
    }
    else
    {
      System.out.println("NO");
    }
  }
}
