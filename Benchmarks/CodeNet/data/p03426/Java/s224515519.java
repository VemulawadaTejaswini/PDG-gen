import java.awt.Point;
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int H = sc.nextInt();
        int W = sc.nextInt();
        int D = sc.nextInt();
        int[] gridX = new int[H*W+1];
        int[] gridY = new int[H*W+1];
        int x1, y1, x2, y2;
        //Point[] grid = new Point[H*W+1];
        //Point p1, p2;
        int[] dp = new int[H*W+1];
        int k;
        
        for(int i = 1; i <= H; i++)
            for(int j = 1; j <= W; j++){
                k = sc.nextInt();
                //grid[sc.nextInt()] =  new Point(i,j);
                gridX[k] = i;
                gridY[k] = j;
            }
        
        int Q = sc.nextInt();
        int L, R;
        for(int i = 1; i <= D; i++){
            for(int j = i; j < dp.length-D; j+=D){
                //p1 = grid[j];
                //p2 = grid[j+D];
                x1 = gridX[j];
                y1 = gridY[j];
                x2 = gridX[j+D];
                y2 = gridY[j+D];
                //dp[j] = Math.abs(p2.x-p1.x) + Math.abs(p2.y-p1.y);
                dp[j] = Math.abs(x2-x1) + Math.abs(y2-y1);
            }
        }
        
        int res;
        while(Q-- > 0){
            res = 0;
            L = sc.nextInt();
            R = sc.nextInt();
            while(L < R){
                res += dp[L];
                L += D;
            }
            System.out.println(res);
        }
    }
}