import java.util.*;

class Main{

    void solve(){
        Scanner sc = new Scanner(System.in);

        int INF = Integer.MAX_VALUE/10;

        while(true){
            int n = sc.nextInt(), m =sc.nextInt();
            if(n==0 && m==0) break;

            int[][] aruki = new int[n][n];
            int[][] fune = new int[n][n];
            for(int i=0; i<n; i++){
                Arrays.fill(aruki[i], INF);
                Arrays.fill(fune[i], INF);
                aruki[i][i] = 0; fune[i][i] = 0;
            }
            for(int i=0; i<m; i++){
                int x = sc.nextInt()-1, y = sc.nextInt()-1, t = sc.nextInt();
                char s = sc.next().charAt(0);
                if(s=='L'){
                    aruki[x][y] = t; aruki[y][x] = t;
                }else{
                    fune[x][y] = t; fune[y][x] = t;
                }
            }

            for(int k=0; k<n; k++)
                for(int i=0; i<n; i++)
                    for(int j=0; j<n; j++){
                        aruki[i][j] = Math.min(aruki[i][j], aruki[i][k]+aruki[k][j]);
                        fune[i][j] = Math.min(fune[i][j], fune[i][k]+fune[k][j]);
                    }
            
            int r = sc.nextInt();
            int[] z = new int[r];
            for(int i=0; i<r; i++) z[i] = sc.nextInt()-1;

            int[][] dp = new int[r][n];
            for(int i=0; i<r; i++) Arrays.fill(dp[i], INF);
            dp[0][z[0]] = 0;
            for(int i=1; i<r; i++){
                for(int j=0; j<n; j++){
                    dp[i][j] = Math.min(dp[i][j], dp[i-1][j] + aruki[z[i-1]][z[i]]);
                    for(int k=0; k<n; k++)
                        dp[i][k] = Math.min(dp[i][k], dp[i-1][j] + aruki[z[i-1]][j] + 
                                            fune[j][k] + aruki[k][z[i]]);
                }
            }

            int min = INF;
            for(int i=0; i<n; i++) min = Math.min(min, dp[r-1][i]);
            System.out.println(min);
        }
    }

    public static void main(String[] args){
        new Main().solve();
    }
}