import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    static long[][] dp;

    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] s=br.readLine().split(" ");
        int n=Integer.parseInt(s[0].trim());
        int w=Integer.parseInt(s[1].trim());
        Pair[] pairs=new Pair[n];
        for(int i=0;i<n;i++){
            s=br.readLine().split(" ");
            int wt=Integer.parseInt(s[0].trim());
            long v=Long.parseLong(s[1].trim());
            pairs[i]=new Pair(wt,v);
        }
        dp=new long[n][w+1];
        for(int i=0;i<n;i++) {
            Arrays.fill(dp[i], -1);
        }
        System.out.println(knap(pairs,n-1,w));



    }
    public static long algo(Pair[] pairs,int n,int w){

        long[][] dp=new long[n+1][w+1];
        for(int i=1;i<=n;i++){
            for(int j=1;j<=w;j++){
                long max=0;
                if(j-pairs[i-1].w>=0){
                    max=dp[i-1][j-pairs[i-1].w];
                }
                max=Math.max(max,dp[i-1][j]);
                dp[i][j]=max;
            }
        }
        return dp[n][w];



    }



    public static long knap(Pair[] pairs,int n,int w){
        if(n<0){
            return 0;
        }
        if(dp[n][w]!=-1){
//            System.out.println("used");
            return dp[n][w];
        }


        if(w==0){
            dp[n][w]=0;
            return 0;
        }
        long max=0l;
//        System.out.println(n);
        if(w-pairs[n].w>=0){
                max=pairs[n].v+knap(pairs,n-1,w-pairs[n].w);
        }
         max=Math.max(max,knap(pairs,n-1,w));
        dp[n][w]=max;
        return max;
    }




}


class Pair{
    long v;
    int w;;
    Pair(int w,long v){
        this.v=v;
        this.w=w;
    }

}