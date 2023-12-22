import java.util.Scanner;
public class Main{
	public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int[][] dp;
        char[][] map;
        while(scan.hasNext()){
            int h = scan.nextInt();
            int w = scan.nextInt();
            map = new char[h][];
            for(int i = 0;i < h;i++){
            	map[i] = scan.next().toCharArray();
            }
            dp = new int[h+1][w+1];
            for(int i = 1;i <= h;i++){
            	for(int j = 1;j <= w;j++){
            		if(i == 1){
            			dp[i][j] = dp[i][j-1] + (map[i-1][j-1] - '0');
            		}else if(j == 1){
            			dp[i][j] = dp[i-1][j] + (map[i-1][j-1] - '0');
            		}else{
            			dp[i][j] = minimum(dp[i-1][j],dp[i][j-1]) + (map[i-1][j-1] - '0');
            		}
            	}
            }
            System.out.println(dp[h][w]);
        }
    }
    public static int minimum(int a,int b){
        return (a > b)?b:a;
    }
}