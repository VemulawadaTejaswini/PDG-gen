import java.util.*;
import java.io.*;


class Main {

    static int n,m;
    static char arr[][];
    static long memo[][];

    public static long dp(int i , int j)
    {
        if(i == n-1 && j == m-1)
            return 1l;

        if(i >= n || j >= m)
            return 0l;

        if(memo[i][j] != -1)
            return memo[i][j];

        memo[i][j] = 0l;

        if(arr[i][j] == '.')
            memo[i][j] = dp(i+1 , j)%(1000000000+7) + dp(i , j+1)%(1000000000+7);

        return memo[i][j]%(1000000000+7);
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        StringTokenizer st1 = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st1.nextToken());
        m = Integer.parseInt(st1.nextToken());

        arr = new char[n][m];
        memo = new long[n][m];

        for(int i = 0 ; i < n ; i++)
        {
            String ss = br.readLine();

            for(int j = 0 ; j < m ; j++)
            {
                arr[i][j] = ss.charAt(j);
                memo[i][j] = -1;
            }
        }

        out.println(dp(0,0));



        out.flush();
        out.close();
    }

}