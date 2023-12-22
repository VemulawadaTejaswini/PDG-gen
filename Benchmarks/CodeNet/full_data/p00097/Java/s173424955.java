import java.util.*;

class Main{

    void solve(){
        Scanner sc = new Scanner(System.in);
        
        
          int[][][] dp = new int[1001][101][10];
          
          //dp[0][0][1] = 1;
          for(int i=0; i<=100; i++) dp[i][i][1] = 1;
          
          for(int i=1; i<=9; i++){
              for(int j=0; j<=100; j++){
                  for(int k=j; k<=1000; k++){
                      for(int l=0; l<j; l++){
                          dp[k][j][i] += dp[k-j][l][i-1];
                      }
                  }
              }
          }
        
        
        while(true){
            int n = sc.nextInt();
            int s = sc.nextInt();
            if(n==0 && s==0) break;
            
            /*
            int[][][] dp = new int[2][s+1][101];
            dp[0][0][1] = 1;
            
            int idx = 0;
            for(int i=1; i<=n; i++){
                for(int j=0; j<=100; j++){
                    for(int k=j; k<=s; k++){
                        for(int l=0; l<j; l++){
                            if(dp[1-idx][k-j][l]>0){
                                System.out.println("k* "+k+" "+l+" "+dp[1-idx][k-j][l]+" "+idx+" "+i);
                            }
                            dp[idx][k][j] += dp[1-idx][k-j][l];
                        }
                    }
                }
                //System.out.println("p");
                idx = 1-idx;
                for(int j=0; j<=s; j++)
                    Arrays.fill(dp[idx][j], 0);
            }
            
            idx = 1-idx;
            */

            int cnt = 0;
            for(int i=0; i<=100; i++){
                //if(dp[s][i][n]>0) System.out.println(s+" "+i+" "+dp[s][i][n]);
                cnt += dp[s][i][n];
            }
            
            System.out.println(cnt);
        }
    }
    
    public static void main(String[] args){
        new Main().solve();
    }
}