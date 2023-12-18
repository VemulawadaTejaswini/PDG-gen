import java.util.Scanner;

public final class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        String[] s = new String[h];
        char[][] grid = new char[h][w];
        for(int i=0; i<h; i++){
            s[i] = sc.next();
        }
        int i=0;
        for(String str : s){
            for(int j=0; j<w; j++){
                // System.out.println(i+" "+j);
                grid[i][j] = str.charAt(j);
            }
            i++;
        }
        long[][] dp = new long[h+1][w+1];
        dp[1][1] = 1;
        for(i=1; i<h+1; i++){
            for(int j=1; j<w+1; j++){   
                if(grid[i-1][j-1] == '#'){
                    dp[i][j] = 0;
                    continue;                    
                }
                dp[i][j] = Math.max(dp[i][j],dp[i-1][j]+dp[i][j-1])%1000000007;
            }
        }
        // for(i=1; i<h+1; i++){
        //     for(int j=1; j<w+1; j++){   
        //         System.out.print(dp[i][j]+" ");
        //     }System.out.println();
        // }
        System.out.println(dp[h][w]);
        sc.close();
    }
}