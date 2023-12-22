import java.util.*;
 
public class Main
{
  public static void main(String[]args)
  {
 	Scanner console = new Scanner(System.in);
    int n = console.nextInt();
    n = n % 1000;
    if(n == 0)
    {
    	System.out.print(n);
    }
    else
    {
    	int answer = 1000 - n;
    	System.out.print(answer);
    }
  }
}