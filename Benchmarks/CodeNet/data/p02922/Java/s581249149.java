import java.util.*;

public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int socket = 1;
    int tap = 0;
    while(b > socket + tap * a - tap)
    {
      tap++;
    }

    System.out.println(tap);
  }

}
