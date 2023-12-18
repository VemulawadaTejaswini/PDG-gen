import java.util.*;

public class Main {
    static int n, k;
    static long[] a;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        a = new long[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextLong();
        }
        sc.close();

        Arrays.sort(a);

        if(a[0] >= k){
            System.out.println(0);
            return;
        }
        if(!checkNeed(n-1)){
            System.out.println(n);
            return;
        }


        int l = 0, r = n-1;
        while(r-1>l){
            int m = (l+r)/2;
            if(checkNeed(m)){
                r = m;
            }else{
                l = m;
            } 
        }



        System.out.println(l+1);
    }

    static boolean checkNeed(int pos){
        if(a[pos] > k) return true;

        boolean[][] dp = new boolean[n][k+1];
        dp[0][0] = true;
        dp[0][(int)a[0]] = true;
        for(int i=1; i<n; i++){
            dp[i][0] = true;
            for(int j=0; j<k+1; j++){
                dp[i][j] = dp[i-1][j];
            }
            if(i == pos) continue;
            for(int j=0; j<k+1 - a[i]; j++){
                if(dp[i-1][j]) dp[i][j+(int)a[i]] = true;
            }
        }

        for(int i=k-(int)a[pos]; i<k; i++){
            if(dp[n-1][i]) return true;
        }
        return false;
    }
}