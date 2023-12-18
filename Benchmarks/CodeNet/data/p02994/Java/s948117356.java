import java.util.*;
public class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int n =sc.nextInt();
    int s = sc.nextInt();
    int sum=0;
    if( s > 0)
    {
        for(int i=2;i<=n;i++)
        {
            sum =sum + (s + i -1);
        }
    }
    else if(s == 0)
    {
        n=n-1;
        sum = (n*(n+1)) / 2; 
    }
    else
    {
        if(n+s > 0)
        {
            for(int i=1;i<=n;i++)
            {
                sum =sum + (s + i -1);
            }
        }
        else 
        {
            for(int i=1;i<=n-1;i++)
            {
                sum =sum + (s + i -1);
            }
        }
    }
    
    System.out.println(sum);
    
  }
}