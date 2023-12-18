import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    try(Scanner sc = new Scanner(System.in))
    {
      final int a = sc.netxtInt();
      final int b = sc.netxtInt();
      
      if( (a*b)%2 == 0 )
      {
        System.out.println("Even");
      }
      else
      {
        System.out.println("Odd");
      }
    }
  }
}