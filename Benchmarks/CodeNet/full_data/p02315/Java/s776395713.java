import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int W = sc.nextInt();
        int dp[][] = new int[N+1][W+1];
        for(int i = 0 ; i < W+1 ; i++)
            dp[0][i] = 0;
        Data data[] = new Data[N];
        for(int i = 0 ; i < N ; i++){
            int v = sc.nextInt();
            int w = sc.nextInt();
            data[i] = new Data(v,w);
        }
        for(int i = 0 ; i < N ; i++){
            for(int j = 0 ; j < W+1 ; j++){
                if(data[i].w <= j)
                    dp[i+1][j] = Math.max(dp[i][j-data[i].w] + data[i].v , dp[i][j]);
                else
                    dp[i+1][j] = dp[i][j];
            }
        }
        System.out.println(dp[N][W]);
    }
}
class Data{
    int v;
    int w;
    Data(int v, int w){
        this.v = v;
        this.w = w;
    }
}
