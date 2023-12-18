import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{
  public static void main(String[] args) throws IOException
  {
    BufferedReader r = new BufferedReader(new InputStreamReader(System.in), 1);

    int n = Integer.parseInt(r.readLine());
    int a[] = new int[200001];
    int x[] = new int[200001];

    for(int i = 0; i < n; i++)
    {
      a[i] = Integer.parseInt(r.readLine());
    }

    for(int i = 0; i < n; i++)
    {
      if(i < a[i] || a[i + 1] - a[i] > 1)
      {
        System.out.println(-1);
        System.exit(0);
      }
    }

    int v = 0;
    for(int i = n - 1; 0 < i; i--)
    {
      if(x[i] == a[i])
      {
        continue;
      }
      else if(a[i - 1] + 1 == a[i])
      {
        v++;
        x[i] = a[i];
      }
      else if(a[i - 1] == a[i])
      {
        v += a[i];
        x[i] = a[i];
      }
      else
      {
        v += a[i];
        for(int j = 0; j < a[i]; j++)
        {
          x[i - j] = a[i] - j;
        }
      }
    }
    System.out.println(v);

  }
}
