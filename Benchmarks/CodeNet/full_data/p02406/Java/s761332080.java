import java.util.Scanner;
public class Main
{
  public static void main(String[] args)
  {
    int i;
    int j = 1;
    Scanner sc= new Scanner(System.in);
    while(true)
    {
      int n = sc.nextInt();
      for(i = 0; i < n / 3 ; i++)
      {
        if(i * 3 > j * 10 + 3)
        {
          System.out.print(j * 10 + 3);
          System.out.print(' ');
          j++;
          System.out.print(i * 3);
          System.out.print(' ');
        }
        else
        {
          System.out.print(i * 3);
          System.out.print(' ');
        }
      }
    }
  }
}