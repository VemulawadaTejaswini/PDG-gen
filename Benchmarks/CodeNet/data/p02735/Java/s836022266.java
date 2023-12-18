import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        char[][] map = new char[h][w];
        int[][] dp = new int[h][w];
        for(int i = 0; i < h; i++){
            map[i] = sc.next().toCharArray();
        }
        for(int i = 0; i < h; i++){
            for(int j = 0; j < w; j++){
                int p = map[i][j] == '#' ? 1 : 0;
                if(i == 0 && j == 0){
                    dp[i][j] = p;
                }else if(i == 0){
                    dp[i][j] = dp[i][j-1] + p;
                }else if(j == 0){
                    dp[i][j] = dp[i-1][j] + p;
                }else{
                    dp[i][j] = Math.min(dp[i][j-1],dp[i-1][j]) + p;
                }
            }
        }
        System.out.println(dp[h-1][w-1]);
    }
}
