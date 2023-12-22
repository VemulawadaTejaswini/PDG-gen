import java.util.Scanner;

public class Main
{

  public static void main(String[] args)
  {
    try (Scanner scanner = new Scanner(System.in);)
    {
      while (scanner.hasNextLine())
      {
        char[] charArray = scanner.nextLine().toCharArray();
        System.out.println(solver(charArray));
      }
    }
  }

  private static char solver(char[] charArray)
  {
    char[][] array =
    {
        { charArray[0], charArray[1], charArray[2] },
        { charArray[3], charArray[4], charArray[5] },
        { charArray[6], charArray[7], charArray[8] } };

    for (int i = 0; i < array[0].length; i++)
    {
      if (isEqual(array[i][0], array[i][1], array[i][2]))
      {
        if (array[i][0] == 's')
        {
          continue;
        }
        return array[i][0];
      }
    }
    for (int i = 0; i < array.length; i++)
    {
      if (isEqual(array[0][i], array[1][i], array[2][i]))
      {
        if (array[0][i] == 's')
        {
          continue;
        }
        return array[0][i];
      }
    }
    if (isEqual(array[0][0], array[1][1], array[2][2]))
    {
      if (array[1][1] != 's')
      {
        return array[1][1];
      }
    }

    if (isEqual(array[0][2], array[1][1], array[2][0]))
    {
      if (array[1][1] != 's')
      {
        return array[1][1];
      }
    }

    return 'd';
  }

  private static boolean isEqual(char a, char b, char c)
  {
    return (a == b && a == c);
  }

}

