import java.util.*;
import java.io.*;
import java.lang.*;

 class Main{

    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder("");
    static StringTokenizer stk = new StringTokenizer("");
    static int m = 1000000007;

    public static  void main(String args[]){
        try{
            stk = new StringTokenizer(bf.readLine());
             int H = Integer.parseInt(stk.nextToken());
             int W = Integer.parseInt(stk.nextToken());
             boolean arr[][] = new boolean[H][W];

            for(int i=0;i<H;i++){
                String s = bf.readLine();
                for(int j=0;j<W;j++){
                    arr[i][j] =  s.charAt(j) == '.' ? true : false;
                }
            }

            System.out.println(solver(arr, H, W));

        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static int solver(boolean[][] arr, int H,int W){
        int[][] dp = new int[H][W];
        dp[0][0] = 1;

        for(int i=0;i<H;i++){
            for(int j=0;j<W ;j++){
                if(i-1 >= 0 && j-1 >=0){

                    dp[i][j] = ((arr[i-1][j] == true ? dp[i-1][j]%m : 0) + (arr[i][j-1] == true ? dp[i][j-1]%m : 0 ))%m;
                
                }else if(i-1 >= 0 && j-1 < 0){

                    dp[i][j] = (arr[i-1][j] == true ? dp[i-1][j]%m : 0) ;
                
                }else if(i-1 < 0 && j-1 >=0){
                   
                    dp[i][j] = arr[i][j-1] == true ? dp[i][j-1]%m : 0 ;
                
                }
            }
        }

       return dp[H-1][W-1]%m;
    }

}

