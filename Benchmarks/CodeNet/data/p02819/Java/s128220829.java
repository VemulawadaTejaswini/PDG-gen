import java.util.Scanner;
 
public class Main
{
  public static void main(String args[])
  {
    Scanner std = new Scanner(System.in);
    int n = std.nextInt();
    
    while(true)
    {
        for(int i = 2; i < n; i++)
    	{
      		if(n % i != 0)
      		{
              System.out.println(n);
              System.exit(0);
      		}
    	}
      n++;
    }
  }
}