import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long M = sc.nextLong();
        long mod = 1000000007;
        long ans = 1;
        final int m = (int)Math.sqrt(M);
        boolean[] prm = new boolean[m+1];
        for(int i = 2;i < m+1;i++)  prm[i] = true;
        for(int i = 2;i < m+1;i++){
            if(prm[i]){
                for(int j = i*2;j < m+1;j += i) prm[j] = false;
            }
        }
        int[] L1 = new int[m+1];
        int id = 0;
        for(int i = 2;i < m+1;i++){
            if(prm[i] && M%i == 0){
                while(M%i == 0){
                    L1[id]++;
                    M /= i;
                }
                id++;
            }
        }
        if(M != 1){
            L1[id]++;
            id++;
        }
        for(int i = 0;i < id;i++){
            ans *= comb((long)L1[i]+N-(long)1, (long)L1[i], mod);
            ans %= mod;
        }
        System.out.println(ans);
    }
    public static long comb(long n, long m, long r){
        if(m == 0)  return 1;
        final int mm = (int)m;
        long[] A = new long[mm];
        long[] B = new long[mm];
        for(int i = 0;i < mm;i++){
            A[i] = n-i;
            B[i] = mm-i;
        }
        for(int i = 0;i < mm;i++){
            for(int j = 0;j < mm;j++){
                if(A[j]%B[i] == 0){
                    A[j] /= B[i];
                    break;
                }
            }
        }
        long ans = 1;
        for(int i = 0;i < mm;i++){
            ans *= A[i];
            ans %= r;
        }
        return ans;
    }
}