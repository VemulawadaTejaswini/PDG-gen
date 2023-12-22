import java.util.Arrays;
import java.util.Comparator;
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
        int[][] data = new int[n][2];
        for (int i = 0; i < n; i++)
        {
          String[] tmp = scanner.nextLine().split(" ");
          data[i][0] = Integer.valueOf(tmp[0]);
          data[i][1] = Integer.valueOf(tmp[1]);
        }
        solver(data);
      }
    }
  }

  private static void solver(int[][] data)
  {
    int ans = Integer.MAX_VALUE;
    int diffX = Integer.MAX_VALUE;

    Arrays.parallelSort(data, new Comparator<int[]>() {
      @Override
      public int compare(int[] o1, int[] o2)
      {
        return Integer.compare(o1[0], o2[0]);
      }
    });

    for (int i = 0; i < data.length; i++)
    {
      for (int j = i + 1; j < data.length; j++)
      {
        
        if (diffX < Math.abs(data[i][0] - data[j][0]))
        {
          break;
        }
    
        int tmp = (data[i][0] - data[j][0]) * (data[i][0] - data[j][0])
            + (data[i][1] - data[j][1]) * (data[i][1] - data[j][1]);

        if (ans > tmp)
        {
          ans = tmp;
          diffX = (int) Math.sqrt(ans);
        }
      }
    }

    System.out.println(ans);
  }

}

