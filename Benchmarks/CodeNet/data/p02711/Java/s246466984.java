import java.util.*;
public class sol
{
  public static void main(String args[])
  {
    
	  Scanner sc = new Scanner(System.in());
    int N = sc.nextInt();
    while(N!=0)
    {
      if(N%10==7)
      {
        System.out.print("Yes");
        break;
      }
      N/=10;
    }
    System.out.println("No");
  }
}