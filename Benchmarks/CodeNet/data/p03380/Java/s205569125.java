import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{

  public static void main(String[] args) throws IOException
  {
    BufferedReader r = new BufferedReader(new InputStreamReader(System.in), 1);
    int n = Integer.parseInt(r.readLine());
    String[] sl = r.readLine().split("[\\s]+");
    int[] x = new int[n];
    
    int z = 0;
    for(int i = 0; i < n; i++)
    {
      x[i] = Integer.parseInt(sl[i]);
      if(z < x[i])
      {
        z = x[i];
      }
    }
    
    int v = 0;
    
    for(int i = 0; i < n; i++)
    {
      if(v < x[i] && x[i] <= z / 2)
      {
        v = x[i];
      }
    }
    
    System.out.printf("%d %d", z, v);
  }


}
