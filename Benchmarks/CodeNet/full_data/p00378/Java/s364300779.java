import java.util.Scanner;

public class Main
{

  public static void main(String[] args)
  {
    try (Scanner sc = new Scanner(System.in))
    {
      String[] tmp = sc.nextLine().split(" ");
      final int A = Integer.parseInt(tmp[0]);
      final int B = Integer.parseInt(tmp[1]);
      final int X = Integer.parseInt(tmp[2]);

      System.out.println(solve(A, B, X));
    }
  }

  private static int solve(int a, int b, int x)
  {
    int ret = 0;

    if (a >= (b * 2))
    {
      ret = (x / 500) * b;
      if (x % 500 > 0)
      {
        ret += b;
      }

      return ret;
    }

    ret = x / 1000 * a;

    if (a < b)
    {
      if (x % 1000 > 0)
      {
        ret += a;
      }
      return ret;
    }

    if (x % 1000 > 500)
    {
      ret += a;
    }
    else if (x % 1000 > 0)
    {
      ret += b;
    }

    return ret;

  }
}

