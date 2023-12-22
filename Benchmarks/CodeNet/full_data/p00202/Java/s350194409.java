import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static int[][] dp;
    static int n, x;
    static int[] value;
    static boolean[] prime = new boolean[1000001];
    public static void main(String[] args) {
        makePrime();
        while(read()){
            solve();
        }

    }

    static void makePrime(){
        Arrays.fill(prime, true);
        prime[0] = false;
        prime[1] = false;
        for(int i = 2; i < prime.length; i++){
            if(prime[i]){
                for(int j = i*2; j < prime.length; j += i)prime[j] = false;
            }
        }
    }

    static boolean read(){
        n = sc.nextInt();
        x = sc.nextInt();
        if( n == 0 && x == 0)return false;

        dp = new int[n+1][x+1];
        value = new int[n];

        for(int i = 0; i < value.length; i++){
            value[i] = sc.nextInt();
        }

        return true;
    }

    static void solve(){
        boolean f = false;
        int max = 0;

        for(int i = 0; i < n; i++){
            for(int j = 0; j <= x; j++){

                if(j < value[i]){
                    dp[i+1][j] = dp[i][j];
                }else{
                    dp[i+1][j] = Math.max(dp[i][j], dp[i+1][j - value[i]] + value[i] );
                }

                int k = dp[i+1][j];
                if(prime[k]){
                    max = k;
                    f = true;
                }
            }
        }

        if(f){
            System.out.println(max);
        }else{
            System.out.println("NA");
        }

    }

    static void printDP(){
        for(int i = 0; i < dp.length; i++){
            for(int j = 0; j < dp[0].length; j++){
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
    }
}