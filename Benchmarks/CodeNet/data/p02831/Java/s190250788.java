import java.util.*;

public class Main
{
  public static void main(String args[])
  {
    Scanner s = new Scanner(System.in);
    int a = s.nextInt();
    int b = s.nextInt();
    int temp = 0;
    int c = a;
    c *= b;
    
    while((temp = a % b) != 0)
    {
      a = b;
      b = temp;
    }
    
    System.out.println(c / b);
  }
}