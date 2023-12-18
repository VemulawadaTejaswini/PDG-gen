import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{
  public static void main(String[] args) throws IOException
  {
    BufferedReader r = new BufferedReader(new InputStreamReader(System.in), 1);

    int n = Integer.parseInt(r.readLine());
    int a[] = new int[200000];
    int x[] = new int[200000];

    for(int i = 0; i < n; i++)
    {
      a[i] = Integer.parseInt(r.readLine());
    }

    for(int i = 0; i < n; i++)
    {
      if(i < a[i])
      {
        System.out.println(-1);
        System.exit(0);
      }
    }

    int v = 0;
    for(int i = n - 1; 0 < i; i--)
    {
      boolean f = false;
      for(int c = 0; c <= a[i]; c++)
      {
        if(x[i - c] == a[i] - c)
        {
          for(int j = i; i - c < j; j--)
          {
            x[j] = a[i] - i + j;
            v++;
          }
          f = true;
          break;
        }
      }
      if(!f)
      {
        System.out.println(-1);
        System.exit(0);
      }
    }
    System.out.println(v);

  }
}
