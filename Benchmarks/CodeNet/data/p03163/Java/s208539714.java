import java.util.*;

class Main {
    static long[][] dp;
    static int[][] wv;
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), w=in.nextInt();
        dp=new long[w+1][n+1];

        for(int i=0;i<=w;i++){
            for(int j=0;j<=n;j++){
                if(i==0)
                    dp[i][j]=0;
                else
                    dp[i][j]=-1;
            }
        }

        wv = new int[n][2];

        for(int i=0;i<n;i++){
            wv[i][0] = in.nextInt();
            wv[i][1] = in.nextInt();
        }
        System.out.println(maxValue(w, 0));

    }

    public static long maxValue(int w, int ind){
        if(dp[w][ind]!=-1)
            return dp[w][ind];
        if(ind>wv.length-1)
            return 0;
        if(w<wv[ind][0])
            return dp[w][ind] = maxValue(w,ind+1);
        return (dp[w][ind] = (Math.max(wv[ind][1]+maxValue(w-wv[ind][0],ind+1), maxValue(w,ind+1))));

    }
}