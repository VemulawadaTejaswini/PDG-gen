import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main
{

  public static void main(String[] args)
  {
    try (Scanner scanner = new Scanner(System.in))
    {
      while (scanner.hasNextLine())
      {
        int n = Integer.valueOf(scanner.nextLine());
        int[] data = new int[n];
        for (int i = 0; i < n; i++)
        {
          data[i] = Integer.valueOf(scanner.nextLine());
        }
        solver(data);
      }
    }
  }

  private static void solver(int[] data)
  {
    Arrays.sort(data);

    List<Integer> ansList = new ArrayList<>();
    for (int i = 0; i < 4; i++)
    {
      for (int j = 0; j < 4; j++)
      {
        if (i == j)
        {
          continue;
        }
        ansList.add(Integer.valueOf(String.valueOf(data[i]) + String.valueOf(data[j])));
      }
    }

    ansList.sort(null);
    System.out.println(ansList.get(2));
  }

}

