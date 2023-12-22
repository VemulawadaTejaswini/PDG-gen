import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long X = sc.nextLong();
        long K = sc.nextLong();
        long D = sc.nextLong();
        if (X < 0) X *= -1;
        long mod = X%D;
        long cnt;
        long min1;
        long min2;
        if (mod <= D-mod) {
            cnt = (X-mod)/D;
            min1 = mod;
            min2 = D-mod;
        } else {
            cnt = (X+(D-mod))/D;
            min1 = D-mod;
            min2 = mod;
        }
        if (K <= cnt) {
            System.out.println(X-K*D);
        } else if ((cnt-K)%2 == cnt%2) {
            System.out.println(min1);
        } else {
            System.out.println(min2);
        }
    }
}
