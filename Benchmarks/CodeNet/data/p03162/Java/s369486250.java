import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

public class Main {
//    static HashMap<Integer,Integer> hm;
    static int[][] dp;
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine().trim());
        int[][] a=new int[n][3];
        for(int i=0;i<n;i++){
            String[] s=br.readLine().split(" ");
            for(int j=0;j<3;j++){
                a[i][j]=Integer.parseInt(s[j].trim());
            }
        }

        dp=new int[n+1][3];
        for(int i=0;i<=n;i++) {
            Arrays.fill(dp[i], -1);
        }

        int res=0;
        for(int i=0;i<3;i++){
            int r=a[0][i]+algo(a,i,1);
//            System.out.println(r+" "+i);
            res=Math.max(r,res);
        }
        System.out.println(res);
    }



    public static int algo(int[][] a,int j,int n){

        if(dp[n][j]!=-1){
            return dp[n][j];
        }
        if(n>=a.length){
            return 0;
        }
        int res=0;
//        dp[n]=0;
        for(int i=0;i<3;i++)
        {
            if(i!=j) {
                int r = a[n][i] ;
                if(n+1<a.length){
                   r=r + algo(a, i, n + 1);
                }
                res = Math.max(r, res);

            }
        }
        dp[n][j]=res;
        return res;
    }


}
