import java.util.*;

public class Main
{
  static int n;
  static int[] h;
  static Integer[] memo;
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
   	n = in.nextInt();
    h = new int[n];
    for (int i = 0; i < n; i++)
      h[i] = in.nextInt();
    
  	memo = new Integer[n];
    System.out.println(dp(0));
    in.close();
  }
  
  public static int dp(int at)
  {
    if (at > n)
      	return (int)1e9;
    if (at == n-1)
      	return 0;
 	if (at == n-2)
      	return (int)Math.abs(h[n-1]-h[n-2]);
   	if (memo[at] != null)
    	return memo[at];
    
    int one = (int)Math.abs(h[at+1]-h[at])+dp(at+1);
    int two = (int)Math.abs(h[at+2]-h[at])+dp(at+2);
    
    return memo[at] = Math.min(one, two);
  }
}