import java.util.Scanner;

public class Main
{

  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);

    while (sc.hasNextLine())
    {
      final int N = sc.nextInt();
      final int A = sc.nextInt();
      final int B = sc.nextInt();
      System.out.println(maxDubleReader(A,B) + " " + minDubleReader(N, A, B));
    }

    sc.close();
  }

  public static int maxDubleReader(int A, int B)
  { 
    return Math.min(A, B);
  }
  
  public static int minDubleReader(int N, int A, int B)
  { 
    return Math.max(0, N-(A+B));
  }
}
