import java.util.*;
public class Main
{
  public static Scanner sc = new Scanner(System.in);
  public static void main(String[]args)
  {
    long n = sc.nextLong();
    int mod = 9;
    int sum =0;
    while(n>0)
    {
      sum +=n%10;
      sum = sum%mod;
      n=n/10;
    }
    if(sum==0 || sum%mod==0)
    	System.out.println("Yes");
    else
        System.out.println("No");
                           
  }
}
