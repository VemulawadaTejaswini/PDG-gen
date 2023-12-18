import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Harry on 4/7/20.
 */
//矩阵快速幂
//https://atcoder.jp/contests/dp/tasks/dp_r
public class Main {
    private static int mod = 1000000007;
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        long K = scanner.nextLong();
        long[][] m = new long[N][N];
        long[] freq = new long[N];
        long[] nextFreq = new long[N];
        Arrays.fill(freq,1);
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                m[i][j] = scanner.nextLong();
            }
        }
        transpose(m);

        //entity matrix
        long[][] ansM = new long[N][N];
        for(int i=0; i<N; i++){
            ansM[i][i] = 1;
        }

        while(K>0){
            if((K&1)==1){
                ansM = multi(ansM, m);
            }
            m = multi(m, m);
            K >>= 1;
        }

        for(int r=0; r<N; r++){
            nextFreq[r] = 0;
            for(int c=0; c<N; c++){
                nextFreq[r] = (nextFreq[r] + ansM[r][c]*freq[c])%mod;
            }
        }

        long res = 0;
        for(long f : nextFreq){
            res = (res + f)%mod;
        }
        System.out.print(res);
    }

    public static long[][] multi(long[][] m, long[][] mm){
        int n = m.length;
        int nn = mm[0].length;
        long[][] res = new long[n][nn];
        for(int r=0; r<n; r++){
            for(int c=0; c<nn; c++){
                for(int i=0; i<nn; i++){
                    res[r][c] = (res[r][c]+(m[r][i]*mm[i][c])%mod)%mod;
                }
            }
        }
        return res;
    }

    public static void transpose(long[][] m){
        for(int i=0; i<m.length; i++){
            for(int j=i+1; j<m.length; j++){
                swap(m, i, j, j, i);
            }
        }
    }

    public static void swap(long[][] m, int r1, int c1, int r2, int c2){
        long temp = m[r1][c1];
        m[r1][c1] = m[r2][c2];
        m[r2][c2] = temp;
    }
}
