import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main
{

  public static void main(String[] args) throws IOException
  {
    BufferedReader r = new BufferedReader(new InputStreamReader(System.in), 1);

    String s;
    String sl[];

    s = r.readLine();
    sl = s.split(" ");
    int n = Integer.parseInt(sl[0]);
    int k = Integer.parseInt(sl[1]);

    int a[] = new int[n];

    for(int i = 0; i < n; i++)
    {
      s = r.readLine();
      a[i] = Integer.parseInt(s);
    }

    Arrays.sort(a);

    int min = 1000000001;
    for(int i = 0; i <= n - k; i++)
    {
      min = Math.min(min, a[i + k - 1] - a[i]);
    }

    System.out.println(min);

  }

}