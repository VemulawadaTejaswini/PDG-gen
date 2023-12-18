import java.util.* ; 

 class Main {
     static long dp[][] = new long[101][100001] ; 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt() ; 
        int w = sc.nextInt() ; 
        long wt[] = new long[n] ; 
        long val[] = new long[n] ; 
        for(int i=0 ; i<n ; i++){
            wt[i] = sc.nextLong() ; 
            val[i] = sc.nextLong() ; 
        }
        for(int i=0 ; i<=n ; i++){
            for(int j=0 ; j<=w ; j++){
                dp[i][j] = -1 ; 
            }
        }
        System.out.println(knapSack(val, wt, n, w));

    }

    static long knapSack(long val[],long wt[],int n, int w){
        if(n==0 || w==0){
            return dp[n][w]=0 ; 
        }
        if(dp[n][w]!=-1){
            return dp[n][w] ; 
        }

        else if(wt[n-1]>w){
           return dp[n][w]=knapSack(val, wt, n-1, w) ; 
        } 
        else{
            return dp[n][w] =  Math.max(val[n - 1] + knapSack(val, wt, n , w - (int)wt[n - 1]), knapSack(val, wt, n - 1, w));
        }
    }
}
