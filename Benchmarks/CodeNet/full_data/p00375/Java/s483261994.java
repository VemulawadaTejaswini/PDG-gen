import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    try (Scanner scanner = new Scanner(System.in))
    {
      while (scanner.hasNextLine())
      {
        int f = Integer.valueOf(scanner.nextLine());
        System.out.println(solver(f));
      }
    }
  }

  private static int solver(int f)
  {
    return (f - 30) / 2;
  }
}

