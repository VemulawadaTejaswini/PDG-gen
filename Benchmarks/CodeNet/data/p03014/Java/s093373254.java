import java.util.*;
import java.io.*;

public class Main
{
  int h, w, max = 0;
  int[][] x;
  char[][] g;
  
  Main(Scanner in, PrintWriter out)
  {
    g = new char[h = in.nextInt()][w = in.nextInt()];
    for (int i = 0; i < h; i++)
      g[i] = in.next().toCharArray();
    
    x = new int[h][w];
    for (int i = 0; i < h; i++)
    {
      int at = 0, st = 0;
      while (at < w)
      {
        int cnt = 0;
        st = at;
        while (at < w && g[i][at] != '#')
        {
          cnt++;
          at++;
        }
        for (int j = st; j < at; j++)
          x[i][j] += cnt;
        at++;
      }
    }
    
    for (int i = 0; i < w; i++)
    {
      int at = 0, st = 0;
      while (at < h)
      {
        int cnt = 0;
        st = at;
        while (at < h && g[at][i] != '#')
        {
          cnt++;
          at++;
        }
        for (int j = st; j < at; j++)
          x[j] += cnt;
        at++;
      }
    }
    
    for (int[] y : x)
      for (int z : y)
        max = Math.max(max, z-1);
    out.println(max);
  }

  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    PrintWriter out = new PrintWriter(System.out);
    new	Main(in, out);
    out.close();
  } 
}
