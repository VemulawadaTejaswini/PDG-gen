import java.util.Scanner;
public class Main
{
  public static void main (String args[])
  {
    Scanner in = new Scanner(System.in);
    int N = in.nextInt();
    int K = in.nextInt();
    
    int dp[] = new int[N+1];
    int H[] = new int[N+1];
    for (int i = 1; i <= N; i++)
    {
      H[i] = in.nextInt();
    }
    dp[1] = 0;
    
    for (int i = 2; i <= N; i++)
    {
      if (i > N)
        	break;
      int min = Integer.MAX_VALUE;
      for (int j = 1; j <= Math.min(i-1,K); j++)
      {
        if (i > N)
	        break;
        if (i-j > N)
	        break;
        int temp = dp[i-j] + Math.abs(H[i] - H[i-j]);
		if (temp < min)
			min = temp;
        
      }
		dp[i] = min;
      	
    }
    System.out.println(dp[N]);
  }
}