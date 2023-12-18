import java.util.*;

class Abc110d
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        long MOD = (long) Math.pow(10, 9) + 7;

        //Mの素因数分解

        int x = M;
        int[] mm = new int[50];
        Arrays.fill(mm, 0);

        int i = 2;
        int index  = 0;
        while( x > 1){
            if(x % i == 0){
                int count = 0;
                while(x % i == 0){
                    count++;
                    x /= i;
                }
                mm[index] = count;
            }
            else{
                if(mm[index] > 0) index++;
                i++;
            }
        }

/*        for(int k = 0; k <= index; k++){
            System.out.println(mm[k]);
        }*/

        long ans = 1;
        long K = index + 1;
        long[] xx = new long[K];
        Arrays.fill(xx,1);
        for(long k = 0; k < K; k++){
            //N H mm[i] = (N + mm[i] - 1) C mm[i] = p C mm[i]
            long p = N + mm[k] - 1;
            for(long j = p; j > p - mm[k]; j--){
                xx[k] *= p + p - mm[k] - j + 1;
                xx[k] /= p - j + 1;
            }
            xx[k] %= MOD;
            ans *= xx[k];
            ans %= MOD;
        }

        System.out.println(ans);
    }
}