import java.util.*;
import java.io.*;


class Main {

    static int n,w;
    static long dp[][];
    static int wi[];
    static long vi[];

    public static long knapsack(int i , int cost)
    {
        if(cost < 0 || i >= n)
            return 0;

        if(dp[i][cost] != 0)
            return dp[i][cost];

        if(cost >= wi[i])
        {
            dp[i][cost] = Math.max(vi[i] + knapsack(i+1 , cost - wi[i]) , knapsack(i+1 , cost));
        }
        else
        {
            dp[i][cost] = knapsack(i+1 , cost);
        }

        return dp[i][cost];
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        StringTokenizer st1 = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st1.nextToken());
        w = Integer.parseInt(st1.nextToken());

        wi = new int [n];
        vi = new long [n];

        for(int i = 0 ; i < n ; i++)
        {
            st1 = new StringTokenizer(br.readLine());

            wi[i] = Integer.parseInt(st1.nextToken());
            vi[i] = Long.parseLong(st1.nextToken());
        }

        dp = new long [n+1][w+1];


        out.println(knapsack(0 , w));


        out.flush();
        out.close();
    }

}