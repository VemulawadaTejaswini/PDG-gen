import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
     Scanner sc = new Scanner(System.in);
     int n = 0;
     if(sc.hasNextInt())
            n = sc.nextInt();
        int[] dp = new int[3];
     for(int i = 0 ; i < n ; i++)
     {
     int[] ndp = new int[3];
     Arrays.fill(ndp,0);
    int[] x = new int[3];
for(int j = 0 ; j < 3 ; j++)
{
    x[j] = sc.nextInt();
}
     //x[0] = 0;
     for(int j = 0 ; j < 3 ; j++)
     {
         for(int k = 0 ; k < 3 ; k++)
         {
             if(j != k)
             {
                 ndp[k] = Math.max(ndp[k] , dp[j]+x[k]);
             }
         }
     }
     dp = ndp;

     }
      int max =  Math.max(Math.max(dp[0],dp[1]),dp[2]);
          System.out.println(max);

    }
}
