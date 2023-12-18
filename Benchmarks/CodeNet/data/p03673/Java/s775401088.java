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

    int n = Integer.parseInt(r.readLine());

    sl = r.readLine().split(" ");

    int a[] = new int[200006];

    boolean f = false;

    int i = 0;

    for(i = n - 1; i >= 0; i -= 2)
    {
      System.out.printf("%s ", sl[i]);
    }

    if(i == -1)
    {
      i = 0;
    }
    else
    {
      i = 1;
    }

    for(; i < n; i += 2)
    {
      System.out.printf("%s ", sl[i]);
    }

  }

}