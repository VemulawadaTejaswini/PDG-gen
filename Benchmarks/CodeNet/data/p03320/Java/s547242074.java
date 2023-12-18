
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{

  public static void main(String[] args) throws IOException
  {
    BufferedReader r = new BufferedReader(new InputStreamReader(System.in), 1);
    String s = r.readLine();
    int k = Integer.parseInt(s);

    for(int i = 0; i < k; i++)
    {
      System.out.print(i % 9 + 1);
      for(int j = 0; j < i / 9; j++)
      {
        System.out.print(9);
      }
      System.out.println();
    }
  }

}