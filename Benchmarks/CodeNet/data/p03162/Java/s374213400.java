import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.*;

class Main {

    static int min(int a, int b) {
        return Math.min(a, b);
    }

    static int abs(int a) {
        return Math.abs(a);
    }

    static int get(String s)
    {
        return Integer.parseInt(s);
    }
    static int max(int a,int b)
    {
        return Integer.max(a, b);
    }
    static int max(int a,int b,int c)
    {
        return Math.max(a, Math.max(b, c));
    }
    public static void main(String[] args) throws Exception 
    
    {
        PrintWriter p = new PrintWriter(System.out);
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(bf.readLine());
        int[] a = new int[n],b = new int[n], c= new int[n];
    
        for (int i = 0; i < n; i++) {
            String[] temp = bf.readLine().split(" ");
            a[i] = get(temp[0]);
            b[i] = get(temp[1]);
            c[i] = get(temp[2]);

        }
        int dp[][] = new int[n][3]; //n rows and 3 cols

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                if(i == 0) { //first day
                    if(j == 0 ) dp[i][j] =a[i];
                    else if(j ==1) dp[i][j] = b[i];
                    else if(j ==2 ) dp[i][j] = c[i];
                }else{
                    for (int k = 0; k < 3; k++) {
                        if(j == k) continue; // if previous day activity and present day activity is the same
                        if( j == 0) dp[i][j] = max(dp[i][j], dp[i-1][k]+a[i]);
                        else if( j == 1) dp[i][j] = max(dp[i][j], dp[i-1][k]+b[i]);
                        else if (j == 2)
                            dp[i][j] = max(dp[i][j], dp[i - 1][k] + c[i]);

                    }
         
                }
            }
        }
 
        int ret = max(dp[n-1][0], dp[n-1][1], dp[n-1][2]);
 
        p.println(ret);
        p.flush();
    }
}