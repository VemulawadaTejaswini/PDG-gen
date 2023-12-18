import java.util.Scanner;
 
public class Main
{
  public static void main(String args[])
  {
    Scanner std = new Scanner(System.in);
    long t = std.nextLong();
    long a = std.nextLong();
    long k = std.nextLong();
    
    for(long i = 0; i < k; i++)
    {
      if(t >= 1)
      {
        t--;
      }
      else if(a >= 1)
      {
        a--;
      }
      else
      {
        ;
      }
    }
    System.out.println(t + " " + a);
  }
}