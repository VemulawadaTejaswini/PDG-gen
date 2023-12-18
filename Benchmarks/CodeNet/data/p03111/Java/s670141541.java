import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main
{
  static int a;
  static int b;
  static int c;

  static int n;
  static int l[];

  public static void main(String[] args) throws IOException
  {
    BufferedReader r = new BufferedReader(new InputStreamReader(System.in), 1);
    PrintWriter out = new PrintWriter(System.out);

    String s;
    String sl[];

    s = r.readLine();
    sl = s.split(" ");

    n = Integer.parseInt(sl[0]);
    a = Integer.parseInt(sl[1]);
    b = Integer.parseInt(sl[2]);
    c = Integer.parseInt(sl[3]);

    l = new int[n];
    for(int i = 0; i < n; i++)
    {
      l[i] = Integer.parseInt(r.readLine());
    }
    out.println(search(n - 1, 0, 0, 0, 0));
    out.flush();
  }

  public static int search(int n, int m, int aa, int bb, int cc)
  {
    if(n == -1)
    {
      if(aa == 0 || bb == 0 || cc == 0)
      {
        return 99999999;
      }
      return Math.abs(aa - a) + Math.abs(bb - b) + Math.abs(cc - c) + m;
    }
    int z = search(n - 1, m, aa, bb, cc);
    z = Math.min(z, search(n - 1, aa == 0 ? m : m + 10, aa + l[n], bb, cc));
    z = Math.min(z, search(n - 1, bb == 0 ? m : m + 10, aa, bb + l[n], cc));
    z = Math.min(z, search(n - 1, cc == 0 ? m : m + 10, aa, bb, cc + l[n]));

    return z;
  }

}