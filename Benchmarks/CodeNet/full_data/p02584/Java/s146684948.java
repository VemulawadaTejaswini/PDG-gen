import java.util.Scanner;

public class Main {

    static long X;
    static long K;
    static long D;
    static long min;
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        X = sc.nextLong();
        K = sc.nextLong();
        D = sc.nextLong();

        if (X <= D) {
            min = calc2(X, K);
        } else {
            min = calc(X, K, D, K / 2);
            long ans = 0l;
            for (long i = 0l; i < K; i++) {
                ans = calc(X, K, D, i);
                //System.out.println(ans);
                if (ans < min) {
                    min = ans;
                }
            }
        }
        System.out.println(min);
    }

    static long calc(long X, long K, long D,long i){
        return Math.abs(X-(((K-i)*D)-i*D));
    }
    static long calc2(long X, long K){
        if(K%2 == 0){
            return X;
        }else{
            return Math.abs(X)-Math.abs(K);
        }
    }
}
