import java.util.*;

public class Main {
    static final long DIV = 998244353;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int sum = 0;
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
            sum += a[i];
        }
        sc.close();

        int half = sum / 2;
        if(sum % 2 == 0) half -= 1;

        long[][] dp1 = new long[n+1][sum+1];
        dp1[0][0] = 1;
        for(int i=0; i<n; i++){
            for(int j=0; j<sum+1; j++){
                dp1[i+1][j] = dp1[i][j]* 2;
                if(j >= a[i]){
                    dp1[i+1][j] += dp1[i][j - a[i]];
                }
                dp1[i+1][j] %= DIV;
            }
        }

        long osum = 0;
        for(int i=half+1; i<sum+1; i++){
            osum += dp1[n][i];
            osum %= DIV;
        }

        long pown = 1;
        for(int i=0; i<n; i++){
            pown *= 3;
            pown %= DIV;
        }

        for(int i=0; i<3; i++){
            pown -= osum;
            if(pown < 0) pown += DIV;
        }

        if(sum % 2 == 0){
            long[][] dp2 = new long[n+1][sum+1];
            dp2[0][0] = 1;
            for(int i=0; i<n; i++){
                for(int j=0; j<sum+1; j++){
                    dp2[i+1][j] = dp2[i][j];
                    if(j >= a[i]){
                        dp2[i+1][j] += dp2[i][j - a[i]];
                    }
                    dp2[i+1][j] %= DIV;
                }
            }
            pown += dp2[n][half+1] * 3;
            pown %= DIV;
        }

        System.out.println(pown);
    }
}