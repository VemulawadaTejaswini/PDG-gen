import java.util.Scanner;

public class Main
{

  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);

    while (sc.hasNextLine())
    {
      String[] input = sc.nextLine().split(" ");
      System.out.println(Integer.valueOf(input[0]) + Integer.valueOf(input[1]));
    }

    sc.close();
  }

}

