
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
    int h = Integer.parseInt(sl[0]);
    int w = Integer.parseInt(sl[1]);

    int[][] a = new int[555][555];
    int[][] o = new int[100000][4];
    
    for(int i = 1; i <= h; i++)
    {
      s = r.readLine();
      sl = s.split("[\\s]+");
      for(int j = 1; j <= w; j++)
      {
        a[i][j] = Integer.parseInt(sl[j - 1]);
      }
    }

    int c = 0;
    
    for(int i = 1; i <= h; i++)
    {
      if(i % 2 == 1)
      {
        for(int j = 1; j < w; j++)
        {
          if(a[i][j] % 2 == 1)
          {
            o[c][0] = j;
            o[c][1] = i;
            o[c][2] = j + 1;
            o[c][3] = i;
            c++;
            a[i][j]--;
            a[i][j + 1]++;
          }
        }
        if(i < h && a[i][w] % 2 == 1)
        {
          o[c][0] = w;
          o[c][1] = i;
          o[c][2] = w;
          o[c][3] = i + 1;
          c++;
          a[i][w]--;
          a[i + 1][w]++;
        }
      }
      else
      {
        for(int j = w; 0 < j; j--)
        {
          if(a[i][j] % 2 == 1)
          {
            o[c][0] = j;
            o[c][1] = i;
            o[c][2] = j - 1;
            o[c][3] = i;
            c++;
            a[i][j]--;
            a[i][j - 1]++;
          }
        }
        if(i < h && a[i][0] % 2 == 1)
        {
          o[c][0] = 0;
          o[c][1] = i;
          o[c][2] = 0;
          o[c][3] = i + 1;
          c++;
          a[i][0]--;
          a[i + 1][0]++;
        }
      }
    }
    
    System.out.println(c);
    for(int i = 0; i < c; i++)
    {
      System.out.printf("%d %d %d %d\n", o[i][1], o[i][0], o[i][3], o[i][2]);
    }

  }

}
