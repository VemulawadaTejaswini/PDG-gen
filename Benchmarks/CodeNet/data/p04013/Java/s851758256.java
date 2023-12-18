import java.util.*;
import java.io.*;
class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int A = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] cards = new int[N];
        for(int i=0;i<N;i++){
            cards[i]=Integer.parseInt(st.nextToken());
        }

        long[][][] dp = new long[52][52][2502];
        dp[0][0][0]=1;
        for(int i=1; i<=N; i++){
            for(int j=0; j<=i; j++){
                for(int k=0; k<=2501; k++){
                    dp[i][j][k] += dp[i-1][j][k];
                    if(j-1>=0 && k-cards[i-1]>=0)
                        dp[i][j][k] += dp[i-1][j-1][k-cards[i-1]];
                }
            }
        }
        long ans = 0;
        for(int j=1; j<=N; j++){
            ans+=dp[N][j][A*j];
        }
        System.out.println(ans);
    }
}