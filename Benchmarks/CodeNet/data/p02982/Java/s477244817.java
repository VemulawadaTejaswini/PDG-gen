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
    int d = Integer.parseInt(sl[1]);
    
    int v[][] = new int[n][d];
    
    for(int i = 0; i < n; i++)
    {
      sl = r.readLine().split(" ");
      for(int j = 0; j < d; j++)
      {
        v[i][j] = Integer.parseInt(sl[j]);
      }
    }
    int a = 0;
    for(int i = 0; i < n; i++)
    {
      for(int j = i + 1; j < n; j++)
      {
        int s = 0;
        for(int k = 0; k < d; k++)
        {
          s += (v[i][k] - v[j][k]) * (v[i][k] - v[j][k]);
        }
        int k = 0;
        for(k = 0; k * k < s; k++);
        if(k * k == s)
        {
          a++;
        }
      }
    }

    System.out.println(a);
    
  }

}