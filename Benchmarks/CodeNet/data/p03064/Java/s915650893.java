import java.util.*;

public class Main {

    static final long DIV = 998244353;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        long sum = 0;
        for(int i=0; i<n; i++){
            a[i] = sc.nextLong();
            sum += a[i];
        }
        sc.close();

        Arrays.sort(a);

        long[] pow2 = new long[310];
        pow2[0] = 1;
        for(int i=1; i<310; i++){
            pow2[i] = pow2[i-1] * 2;
            pow2[i] %= DIV;
        }

        int half = (int)sum / 2;
        if(sum % 2 == 0) half -= 1;

        long[][] dp1 = new long[half+1][half+1];
        long[][] dp2 = new long[half+1][half+1];

        dp1[0][0] = 1;

        for(int i=0; i<n; i++){
            if(i%2 == 0){
                for(int j=0; j<half+1; j++){
                    for(int k=0; k<half+1; k++){
                        dp2[j][k] = dp1[j][k];
                    }
                }
                for(int j=(int)a[i]; j<half+1; j++){
                    for(int k=0; k<half+1; k++){
                        dp2[j][k] += dp1[j-(int)a[i]][k];
                    }
                }
                for(int j=(int)a[i]; j<half+1; j++){
                    for(int k=0; k<half+1; k++){
                        dp2[k][j] += dp1[k][j-(int)a[i]];
                    }
                }
                for(int j=0; j<half+1; j++){
                    for(int k=0; k<half+1; k++){
                        dp2[j][k] %= DIV;
                    }
                }
            }else{
                for(int j=0; j<half+1; j++){
                    for(int k=0; k<half+1; k++){
                        dp1[j][k] = dp2[j][k];
                    }
                }
                for(int j=(int)a[i]; j<half+1; j++){
                    for(int k=0; k<half+1; k++){
                        dp1[j][k] += dp2[j-(int)a[i]][k];
                    }
                }
                for(int j=(int)a[i]; j<half+1; j++){
                    for(int k=0; k<half+1; k++){
                        dp1[k][j] += dp2[k][j-(int)a[i]];
                    }
                }
                for(int j=0; j<half+1; j++){
                    for(int k=0; k<half+1; k++){
                        dp1[j][k] %= DIV;
                    }
                }
            }
        }

        if(n % 2 == 1){
            for(int j=0; j<half+1; j++){
                for(int k=0; k<half+1; k++){
                    dp1[j][k] = dp2[j][k];
                }
            }
        }

        long ans = 0;
        for(int j=1; j<half+1; j++){
            for(int k=1; k<half+1; k++){
                if(sum - j - k <= half && j+k != sum){
                    ans += dp1[j][k];
                    ans %= DIV;
                }
            }
        }

        System.out.println(ans);
    }
}