import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{

  public static void main(String[] args) throws IOException
  {
    BufferedReader r = new BufferedReader(new InputStreamReader(System.in), 1);
    String sl[];
    
    sl = r.readLine().split(" ");
    int n = Integer.parseInt(sl[0]);
    int m = Integer.parseInt(sl[1]);

    int k[] = new int[100005];
    
    for(int i = 0; i < m; i++)
    {
      sl = r.readLine().split(" ");
      k[Integer.parseInt(sl[0])]++;
      k[Integer.parseInt(sl[1]) + 1]--;
    }
    
    int c = 0;
    for(int i = 1; i < 100004; i++)
    {
      k[i] += k[i - 1];
      if(k[i] == m)
      {
        c++;
      }
    }
    
    System.out.println(c);
  }


}