import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{

  public static void main(String[] args) throws IOException
  {
    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

    int datasetCount = Integer.parseInt(input.readLine());
    for (int i = 0; i < datasetCount; i++)
    {
      String[] INPUT_STR = input.readLine().split(" ");

      System.out.println(solver(INPUT_STR) ? "YES" : "NO");
    }

  }

  private static boolean solver(String[] array)
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
          return false;
        }
        currentB = currentA;
      }
      else
      {
        if (currentC > currentA)
        {
          return false;
        }
        currentC = currentA;
      }
    }
    return true;
  }

}