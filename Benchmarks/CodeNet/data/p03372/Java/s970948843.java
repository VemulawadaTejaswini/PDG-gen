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
        int n = Integer.parseInt(sl[0]);
        long c = Long.parseLong(sl[1]);
        long x[] = new long[123456];
        long vr[] = new long[123456];
        long vl[] = new long[123456];
        x[0] = 0;
        vr[0] = 0;
        for(int i = 1; i <= n; i++)
        {
          s = r.readLine();
          sl = s.split("[\\s]+");
          x[i] = Long.parseLong(sl[0]);
          vr[i] = Long.parseLong(sl[1]);
        }
      
      long max = 0;
      for(int i = 1; i <= n; i++)
      {
        vr[i] += vr[i - 1];
      }
      for(int i = 1; i <= n; i++)
      {
        vl[i] = vr[n] - vr[i - 1];
      }
      
      for(int i = 0; i <= n; i++)
      {
        max = Math.max(max, vr[i] - x[i]);
      }
      
      for(int i = 1; i <= n; i++)
      {
        //System.out.println(vl[i] - (c - x[i]));
        max = Math.max(max, vl[i] - (c - x[i]));
      }
      
      //System.out.println(max);
      max = Math.max(max, vr[n - 1] - c + x[0]);
      //System.out.println(max);
      for(int i = 1; i <= n; i++)
      {
        for(int j = n; i < j; j--)
        {
          max = Math.max(max, vr[i] + vl[j] - 2 * x[i] - (c - x[j]));
          max = Math.max(max, vr[i] + vl[j] - x[i] - 2 * (c - x[j]));
        }
      }
      System.out.println(max);
    }
    
    
}
