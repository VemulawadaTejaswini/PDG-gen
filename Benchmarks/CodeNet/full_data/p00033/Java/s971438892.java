import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{

  public static void main(String[] args) throws IOException
  {
    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

    input.readLine();
    while (input.ready())
    {
      String[] INPUT_STR = input.readLine().split(" ");

      System.out.println(solver(INPUT_STR));
    }

  }

  private static String solver(String[] array)
  {
    int currentA = 0;
    int currentB = 0;
    int currentC = 0;

    for (int i = 0; i < array.length; i++)
    {
      currentA = Integer.parseInt(array[i]);
      if (i % 2 == 0)
      {
        if (currentB > currentA)
        {
          return "NO";
        }
        currentB = currentA;
      }
      else
      {
        if (currentC > currentA)
        {
          return "NO";
        }
        currentC = currentA;
      }
    }
    return "YES";
  }

}