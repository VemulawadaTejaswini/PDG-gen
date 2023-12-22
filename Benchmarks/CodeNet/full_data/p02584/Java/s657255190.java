import java.util.*;

public class Main {

    static int gcd (int a, int b) {return b>0?gcd(b,a%b):a;}
    static long mod = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long X = Math.abs(sc.nextLong());
        long K = sc.nextLong();
        long D = sc.nextLong();
        long ans = 0;
        if(D >= X) {
            if (K % 2 == 0) {
                ans = X;
            } else {
                ans = Math.abs(X - D);
            }

        } else {
            if(X / D > K){
                ans = X - (D * K);
            } else {
                if((K - (X/D)) % 2 == 0){
                    ans = X - (X/D * D);
                } else {
                    ans = Math.abs(X - (X/D * D) -D);
                }
            }
        }


        System.out.println(ans);

    }

}


