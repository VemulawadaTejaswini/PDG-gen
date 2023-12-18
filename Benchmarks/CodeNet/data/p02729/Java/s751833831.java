import java.util.Scanner;
public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int result = 0;
    int sum = 0;
    if(N / 2 == 0 && M / 2 != 0)
       sum = N + M;
    if(sum / 2 == 0)
      result++
      System.out.println(result);
  }
}
