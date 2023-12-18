import java.util.*;
import java.io.*;
public class Main {
    public static double dp[][][] = new double[301][301][301];
    public static double solve(int X , int Y , int Z , int n){
        if(X == 0 && Y == 0 && Z == 0) return 0;
        if(dp[X][Y][Z] >= -0.9){
            return dp[X][Y][Z];
        }

        return dp[X][Y][Z] = ( n + (X * solve(X-1,Y,Z,n)) + (Y * solve(X+1,Y-1,Z,n)) + (Z * solve(X,Y+1,Z-1,n)) )/(X+Y+Z);

    }
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int one = 0;
        int two = 0;
        int three = 0;
        for(int i = 0 ; i < n ; i++){
            int temp = s.nextInt();
            if(temp == 1) one++;
            else if(temp == 2) two++;
            else three++;
        }
        System.out.println(solve(one , two , three , n));
    }
}