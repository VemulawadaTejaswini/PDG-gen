import java.util.*;
import java.io.*;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(), k = scan.nextInt();
        
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = scan.nextInt();
        
        boolean[] dp = new boolean[k + 1];
        dp[0] = false;
        for (int i = 1; i <= k; i++)
            for (int j = 0; j < arr.length; j++)
                if (i - arr[j] >= 0 && dp[i] != true)
                    dp[i] = !dp[i - arr[j]];

        if (dp[k])
            System.out.println("First");
        else
            System.out.println("Second");
    }
}