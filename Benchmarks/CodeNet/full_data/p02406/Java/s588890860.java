import java.util.Scanner;
public class Main
{
  public static void main(String[] args)
  {
    int i;
    int j = 0;
    Scanner sc= new Scanner(System.in);
    while(true)
    {
      int n = sc.nextInt();
      for(i = 1; i <= n ; i++)
      {
        if(i * 3 > j * 10 + 3)
        {
          if(j % 3 == 0)
          {
          }
          else
          {
          System.out.print(j * 10 + 3);
          System.out.print(' ');
          }
        j++;
        }
        System.out.print(i * 3);
        System.out.print(' ');
      }
    }
  }
}