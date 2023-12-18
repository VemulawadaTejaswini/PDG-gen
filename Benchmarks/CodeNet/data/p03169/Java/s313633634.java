import java.util.*;

public class Main {
    static double[][][] dp; 
    static int N;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        // int[] a = new int[N];
        int x=0;
        int y=0;
        int z=0;
        for (int i = 0; i < N; i++) {
            int a = sc.nextInt();
            if (a == 1) {
                x++;
            } else if(a == 2) {
                y++;
            } else if(a == 3) {
                z++;
            }
        }
        dp = new double[N+6][N+6][N+6];
        System.out.println(rec(x,y,z));
   }
   public static double rec(int x, int y, int z) {
       if (x == 0 && y == 0 && z == 0) {
           return 0;
       }
       if (dp[x][y][z] > 0.1) return dp[x][y][z];
       int s = x + y + z;
       if (x>0) {
           dp[x][y][z] += (rec(x-1,y,z) * ((double) x)) / s;
       }
       if (y>0) {
           dp[x][y][z] += (rec(x+1,y-1,z) * ((double) y)) / s;
       }
       if (z>0) {
           dp[x][y][z] += (rec(x,y+1,z-1) * ((double) z)) / s;
       }
       dp[x][y][z] += ((double) N)/s;
       return dp[x][y][z];
   }
}