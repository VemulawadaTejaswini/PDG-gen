import java.util.*;

public class Main
{
  public static void main(String []args)
  {
    Scanner sc = new Scanner(System.in);
    long x = sc.nextLong();
    long l = 3 , r = 1000000000L;
    while(l <= r)
    {
      long mid = (l+r)/2;
      long ans = 180*(mid-2);
      if(ans == mid*x)
      {
        l = mid;
        r = mid;
        break;
      }
      
      else if(ans > x*mid)
      {
        r = mid-1;
      }
      
      else
        l = mid+1;
    }
    System.out.println(l);
  }  
}