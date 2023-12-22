import java.util.Scanner;

public class Main
{

  private static String STR_S;

  private static final String ZERO = "0";

  private static final String ONE = "1";

  private static final String Q = "?";

  public static void main(String[] args)
  {
    try (Scanner scanner = new Scanner(System.in))
    {
      while (scanner.hasNextLine())
      {
        String[] tmp = scanner.nextLine().split(" ");
        final int Q = Integer.parseInt(tmp[1]);
        StringBuilder sb;
        tmp = null;

        STR_S = scanner.nextLine();

        for (int i = 0; i < Q; i++)
        {
          sb = new StringBuilder(scanner.nextLine());
          System.out.println(solver(sb));
        }
      }
    }
  }

  private static int solver(StringBuilder data)
  {
    if (0 > data.indexOf(Q))
    {
      return getValue(data.toString());
    }

    int sum = 0;
    if ((0 > data.indexOf(ONE)) && (0 > data.indexOf(ZERO)))
    {

      final int START = Integer.parseInt(data.toString().replace('?', '0'), 2);
      final int END = Integer.parseInt(data.toString().replace('?', '1'), 2);
      for (int i = START; i <= END; i++)
      {
        sum += getValue(i);
      }
      return sum;
    }

    data.reverse();
    return solver2(data, 0, 0);
  }

  private static int solver2(StringBuilder strBin, int index, int currentSum)
  {
    int sum = 0;

    if (strBin.length() -1 == index)
    {
      if (!strBin.substring(index, index + 1).equals(Q))
      {
        currentSum += Math.pow(2, index) * Integer.parseInt(strBin.substring(index, index + 1));;
        return getValue(currentSum);
      } else {
        sum = getValue(currentSum);
        currentSum += Math.pow(2, index);
        return getValue(currentSum) + sum;
      }

    }
    else
    {
      if (!strBin.substring(index, index + 1).equals(Q))
      {
        currentSum += Math.pow(2, index) * Integer.parseInt(strBin.substring(index, index + 1));
        sum = solver2(strBin, index + 1, currentSum);
      } else {
        sum += solver2(strBin, index + 1, currentSum);
        currentSum += Math.pow(2, index);
        sum += solver2(strBin, index + 1, currentSum);
      }

    }
    return sum;
  }

  private static int getValue(String indexBinString)
  {
    int indexNum = Integer.parseInt(indexBinString, 2);
    return Integer.parseInt(STR_S.substring(indexNum, indexNum + 1));
  }

  private static int getValue(int indexNum)
  {
    return Integer.parseInt(STR_S.substring(indexNum, indexNum + 1));
  }
}

