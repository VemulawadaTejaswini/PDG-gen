
import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] a = new int[N];
        int[] b = new int[N];
        int[] c = new int[N];
        for(int i=0;i<N;i++){
            a[i] = scan.nextInt();
            b[i] = scan.nextInt();
            c[i] = scan.nextInt();
        }

        int[][] dp = new int[N][3];
        fill(dp);
        int max = Integer.MIN_VALUE;
        max = Math.max(maxValue(a,b,c,N-1,2,dp),max);
        fill(dp);
        max = Math.max(maxValue(a,b,c,N-1,2,dp),max);

        fill(dp);
        max = Math.max(maxValue(a,b,c,N-1,3,dp),max);
        System.out.println(max);


    }

    public static void fill(int[][] dp){
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<3;j++){
                dp[i][j] = -1;
            }
        }
    }

    public static int maxValue(int[] a,int[] b,int[] c,int index,int lastElement,int[][] dp){
        if(index<0){
            return 0;
        }

        if(dp[index][lastElement-1]!=-1)
            return dp[index][lastElement-1];
        if(lastElement == 1){
            return dp[index][lastElement-1] = Math.max(maxValue(a,b,c,index-1,2,dp) + b[index],maxValue(a,b,c,index-1,3,dp) + c[index]);
        }
        else if(lastElement == 2){
            return dp[index][lastElement-1] = Math.max(maxValue(a,b,c,index-1,1,dp)+a[index] , maxValue(a,b,c,index-1,3,dp)+c[index]);
        }
        else{
            return dp[index][lastElement-1] = Math.max(maxValue(a,b,c,index-1,1,dp)+a[index],maxValue(a,b,c,index-1,2,dp)+b[index]);
        }
    }
}