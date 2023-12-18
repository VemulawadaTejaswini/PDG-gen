import java.util.*;
class Main
{
    static long mod = 1000000007;
    static long[] p = new long[1000001];
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        int[] x = new int[n*m + 1];
        Arrays.fill(x, 0);
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
            x[a[i]] = 1;
        }
        for(int i = 0; i < m; i++){
            b[i] = sc.nextInt();
            x[b[i]] = 1;
        }
        Arrays.sort(a);
        Arrays.sort(b);
                 p[0] = 1;
         for(int i = 1; i < p.length; i++){
             p[i] = p[i-1] * i;
             p[i] %= mod;
         }
        long ans = p[a[0]-1];
        int cons = n + m - 1;
        int now_m = 0;
        for(int i = 1; i < n-1; i++){
            if(x[a[i]] == 1){
                now_m++;
                if((n - i) + (m - now_m) + cons >= a[i]){
                    return;
                }else{
                    ans *= perm(a[i] - cons - 1, (n - i) + (m - now_m));
                    ans %= mod;
                }
                cons += n - i + m - now_m + 1;
            }else{
                ans *= p[m - now_m];
                ans %= mod;
            }
         }
         System.out.println(ans);
    }
    static  long comb(int n, int m){
            long Mul = p[n];
            long Div = p[m] * p[n-m] % mod;
            long res = Mul * pow(Div, mod - 2) % mod; 
            return res;
    }
    static long perm(int n, int m){
        long mul = p[n];
        long div = p[m];
        long res = mul * pow(div, mod - 2) % mod; 
        return res;
    }
    static  long pow(long n, long p){
            if(p == 0) return 1;
            else if(p % 2 == 0){
                long d = pow(n, p/2);
                return d * d % mod;
            }
            else{
                return n * pow(n, p-1) % mod;
            }
        }
    }
