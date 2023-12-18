import java.util.*;
import java.io.*;

/*
   AtCoder contest
   coder : yoichidon
 */


public class Main {
    static boolean dthDigitIs1(long num, int d){
        return (num & (1L<<d)) != 0;
    }
    static long solve(long K, long[] A){
        int N = A.length;
        long ans = 0;
        boolean free = false;
        for(int d=60; d>=0; d--){
            if(!dthDigitIs1(K,d) && !free) continue;

            int dig1=0, dig0=0;
            for(int n=0; n<N; n++){
                if(dthDigitIs1(K,d)) dig1++;
                else dig0++;
            }

            if(dig1>=dig0){ //ans[d-th digit]=0
                if(dthDigitIs1(K,d)) free=true;
            }else{
                ans += 1L<<d;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long K = sc.nextLong();
        long[] A = new long[N];
        for(int n=0; n<N; n++) A[n]=sc.nextLong();

        long X = solve(K,A);

//        for(int n=0; n<N; n++) System.out.printf("%50s\n", Long.toString(A[n], 2));
//        System.out.printf("%50s\n", Long.toString(X, 2));
        long ans = 0;
        for(int n=0; n<N; n++) ans += (A[n] ^ X);

        System.out.println(ans);

    }
}
