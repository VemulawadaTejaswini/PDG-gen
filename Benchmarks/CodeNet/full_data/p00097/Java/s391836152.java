import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{

  final private static int LIMIT = 100;

  public static void main(String[] args) throws NumberFormatException, IOException
  {
    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

    while (input.ready())
    {
      String[] INPUT_STR = input.readLine().split(" ");
      int numCount = Integer.valueOf(INPUT_STR[0]);
      int sumNumber = Integer.valueOf(INPUT_STR[1]);

      if (numCount == 0 && sumNumber == 0)
      {
        break;
      }

      long ans = solver(numCount, sumNumber);
      System.out.println(ans);
    }
  }

  private static long solver(int numCount, int sumNumber)
  {
    return solver(numCount, sumNumber, 0, 0);
  }

  private static long solver(int numCount, int sumNumber, int currentSum, int startIndex)
  {
    long ret = 0;
    final int limit = sumNumber - currentSum;

    if (numCount == 1)
    {
      if (limit >= startIndex && limit <= LIMIT)
      {
        return 1;
      }
      return 0;
    }
    else
    {
      if (limit > LIMIT * numCount - (numCount * (numCount - 1) / 2))
      {
        return 0;
      }
      if (limit < startIndex * numCount - (numCount + 1) * numCount / 2)
      {
        return 0;
      }
      for (int i = startIndex; i <= LIMIT; i++)
      {
        if (limit < startIndex && limit > LIMIT)
        {
          return 0;
        }
        long beforeRet = ret;
        ret += solver(numCount - 1, sumNumber, currentSum + i, i + 1);
        if (ret > 0 && beforeRet == ret)
        {
          break;
        }
      }
    }
    return ret;
  }

}