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

    String t = r.readLine();

    int n = t.length();

    for(int i = 0; i < n - 1; i++)
    {
      for(int j = i + 2; j < 100; j++)
      {
        int[] z = new int[255];
        for(int k = i; k < j; k++)
        {
          z[t.charAt(k)]++;
          if(z[t.charAt(k)] > ((j - i) >> 1))
          {
            System.out.printf("%d %d", i, j - 1);
            System.exit(0);
          }
        }
      }
    }

    System.out.println("-1 -1");


  }

}