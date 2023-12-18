import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static int dp[];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;
        dp = new int[N+1];
        Arrays.fill(dp,-1);

        System.out.println(dpfunc(N));

    }

    static int dpfunc(int n ){
        if(dp[n] != -1) return dp[n];
        if(n==0) return 0;

        int min = Integer.MAX_VALUE;
        if(n-1>=0){
            int res = dpfunc(n-1);
            min = res<min?res:min;
        }
        int num = 1;
        while(n-Math.pow(6,num) >=0){
            int res = dpfunc((int)(n-Math.pow(6,num)) );
            min = res<min?res:min;
            num++;
        }
        num = 1;
        while(n-Math.pow(9,num) >=0){
            int res = dpfunc((int)(n-Math.pow(9,num)) );
            min = res<min?res:min;
            num++;
        }

        dp[n]= min+1;
        return min+1;
    }

}
