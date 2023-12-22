import java.util.Scanner;
import java.lang.Math;

public class Main {
  public static void call(int n)
  {
    int i = 0;
    while(++i<=n)
    {
      int x = i;
      if (x%3==0)
      {
        System.out.print(" " + i);
        continue;
      }
      while (x>0)
      {
        if (x%10==3)
        {
          System.out.print(" " + i);
          break;
        }
        x /= 10;
      }
    }
    System.out.println();
  }
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    call(n);
    scan.close();
  }
}

