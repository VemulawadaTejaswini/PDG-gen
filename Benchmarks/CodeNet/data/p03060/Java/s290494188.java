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

    int c[] = new int[100];
    int v[] = new int[100];

    s = r.readLine();
    sl = s.split(" ");
    int n = Integer.parseInt(sl[0]);

    s = r.readLine();
    sl = s.split(" ");
    for(int i = 0; i < n; i++)
    {
      v[i] = Integer.parseInt(sl[i]);
    }

    s = r.readLine();
    sl = s.split(" ");
    for(int i = 0; i < n; i++)
    {
      c[i] = Integer.parseInt(sl[i]);
      v[i] -= c[i];
    }

    Arrays.sort(v);

    int ss = 0;
    for(int i = 99; i >= 0; i--)
    {
      if(v[i] <= 0) break;
      ss += v[i];
    }
    System.out.println(ss);


  }

}