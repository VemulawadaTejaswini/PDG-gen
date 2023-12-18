import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.*;

// import 
class Main {


    static int min(int a,int b)
    {
        return Math.min(a, b);
    }

    static int abs(int a)
    {
        return Math.abs(a);
    }

    public static void main(String[] args) throws Exception {
        PrintWriter p = new PrintWriter(System.out);
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // sc.nextLine();
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        
        Object[] nk =Arrays.stream(bf.readLine().split(" ")).map(Integer::parseInt).toArray();

        int n = (int)nk[0];
        int k = (int)nk[1];


        Integer arr[] = Arrays.stream(bf.readLine().split(" ")).map(Integer::parseInt).toArray(Integer[]::new);
        
        int dp[] = new int[n+1];
        // int mod = 100000000+7;
        Arrays.fill(dp, Integer.MAX_VALUE); //fill large values in dp 
        dp[0] = 0;
        for (int i = 0; i < n; i++) 
        {
            for (int j = 1; j <= k; j++)
            {
                if(i+j< n) dp[i+j] = min(dp[i+j],dp[i]+abs(arr[i]-arr[i+j]));    
            }
        }
        // System.out.println(Arrays.toString(dp));
        // System.out.println(dp[n-1]);
        p.println(dp[n-1]);
        p.flush();
    }
}