import java.util.*;
import java.io.*;
import java.lang.Math.*;

class Main{

    static String[] mData = new String[1000];
    static int[][] dp = new int[1000][1000];

    static int H;
    static int W;

    static final int m = 1000000007;

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
    
        H = sc.nextInt();
        W = sc.nextInt();

               

        for(int i = 0; i < H; i++){
            mData[i] = sc.next();
        }
        boolean flag = true;
        for(int i = H - 1; i > -1; i--){
            if( mData[i].charAt(W-1) != '#' && flag ){
               dp[i][W-1] = 1;         
            }
            else{
                flag = false;
                dp[i][W-1] = 0;
            }
        }
        flag = true;
        for(int j = W - 1; j > -1; j--){
            if( mData[H-1].charAt(j) != '#' && flag ){
               dp[H-1][j] = 1;  
            }
            else{
                flag = false;
            }
        }

        for(int i = H - 2; i >= 0; i--){
            for(int j = W - 2; j >= 0; j--){
                if( mData[i].charAt(j) == '#' ){
                    dp[i][j] = 0;
                }
                else{
                    dp[i][j] = (dp[i+1][j] + dp[i][j+1]) % m;
                }
            }
        }        
        System.out.println( dp[0][0] );
    }
}
