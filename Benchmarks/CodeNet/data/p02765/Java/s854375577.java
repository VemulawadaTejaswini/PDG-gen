import java.util.Scanner;
public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Sacnner(System.in);
    int K = sc.nextInt();
    int R = sc.nextInt();
    if(K < 10)
    {
      int Rating = 100 * (10 - 2);
      int Result = R - Rating;
      System.out.println(Result);
    }
    else
    {
      System.out.println(R);
    }
  }
}