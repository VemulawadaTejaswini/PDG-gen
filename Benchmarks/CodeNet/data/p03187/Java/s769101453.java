import java.util.*;
class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        long l = sc.nextLong();
        int n = sc.nextInt();
        long[] x = new long[n+2];
        x[0] = 0; x[n+1] = l;
        for(int i = 1; i <= n; i++){
            x[i] = sc.nextLong();
        }
        long ans = 0;

        for(int k = 1; k <= n; k++){
            long tmp = 0;
            for(int i = 0; i < Math.min(k, n - k); i++){
                tmp += 2 * (x[k-i] + l - x[k + 1 + i]);
            }
            long tmp1 = tmp, tmp2 = tmp;
            if(k * 2 < n){
                tmp = Math.max(tmp - (l - x[k+1]) + 2 * (l - x[2 * k + 1]), tmp - x[k]); 
            }
            else if(k * 2 > n){
                tmp = Math.max(tmp - x[k] + 2 * x[2 * k - n], tmp - (l - x[k+1]));
            }
            else{
                tmp = Math.max(tmp - x[k], tmp - l + x[k+1]);
            }
            ans = Math.max(ans, tmp);
        }
        System.out.println(ans);
    }
}