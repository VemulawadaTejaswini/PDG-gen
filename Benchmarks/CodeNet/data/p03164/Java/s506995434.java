import java.util.*;
class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int W = sc.nextInt();
        int[] w = new int[N], v = new int[N];
        for(int i = 0; i < N; i++){
            w[i] = sc.nextInt();
            v[i] = sc.nextInt();
        }
        long[][] x = new long[N][100001]; //i番目までの荷物から価値がjになるように選んだ時の重さの最小値
        x[0][0] = 0;
        for(int j = 0; j <= 100000; j++){
            for(int i = 0; i < N; i++){
                if(j == 0) x[i][0] = 0;
                else if(i == 0){
                    x[0][j] = (j == v[0]) ? w[0] : -1;
                }
                else if(j - v[i] >= 0 && x[i-1][j - v[i]] >= 0){
                    x[i][j] = (x[i-1][j] >= 0) ? Math.min(x[i-1][j - v[i]] + w[i], x[i-1][j]) : x[i-1][j - v[i]] + w[i];
                }
                else{
                    x[i][j] = x[i-1][j];
                }
           }
        }
        long ans = 0;
        for(int j = 0; j <= 100000; j++){
            if(x[N-1][j] <= W && x[N-1][j] >= 0){
                ans = j;
            }
        }
        System.out.println(ans);
    }
}