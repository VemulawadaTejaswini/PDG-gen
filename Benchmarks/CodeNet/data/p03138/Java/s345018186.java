import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long k = sc.nextLong();
        long[] a = new long[n];
        for(int i=0; i<n; i++) a[i] = sc.nextLong();

        int m = 50;
        int[] num = new int[m];
        long[] pow2 = new long[m];
        pow2[0] = 1;
        for(int i=1; i<m; i++){
            pow2[i] = pow2[i-1]*2;
        }

        for(int i=0; i<n; i++){
            long atmp = a[i];
            for(int j=0; j<m; j++){
                if(atmp >= pow2[m-j-1]){
                    num[m-j-1]++;
                    atmp -= pow2[m-j-1];
                }
            }
        }

        // for(int i=0; i<m; i++){
        //     num[i] = Math.max(num[i], n-num[i]);
        // }

        long f = 0;
        for(int i=m-1; i>=0; i--){
            if(num[i] <= n/2){
                if(f + pow2[i] <= k){
                    f += pow2[i];
                }
            }
        }

        long ans = 0;
        for(int i=0; i<n; i++){
            ans += f ^ a[i];
        }

        System.out.println(ans);
    }
}