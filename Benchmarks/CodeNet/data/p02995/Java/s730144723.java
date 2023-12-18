import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong(), b = sc.nextLong(), c = sc.nextLong(), d = sc.nextLong();
        long ans = 0;
        long c_can;
        long ca = a, cb = b;
        if (ca % c != 0) {
            ca += c - (ca % c);
        }
        if (cb % c != c - 1) {
            cb += c - (cb % c) - 1;
        }
        c_can = (cb - ca+1) / c;

        long d_can;
        long da = a, db = b;
        if (da % d != 0) {
            da += d - (da % d);
        }
        if (db % d != d - 1) {
            db += d - (db % d) - 1;
        }
        d_can = (db - da+1) / d;

        long x = c * d;
        long p = c;
        long q = d;
        /* 自然数 a > b を確認・入替 */
        if(p < q){
            long tmp = p;
            p = q;
            q = tmp;
        }
        /* ユークリッドの互除法 */
        long r = p % q;
        while(r!=0){
            p = q;
            q = r;
            r = p % q;
        }
        long ukuriddo = x/q;

        long c_d_can;
        long cda = a, cdb = b;
        long cd = ukuriddo;
        if (cda % cd != 0) {
            cda += cd - (cda % cd);
        }
        if (cdb % cd != cd - 1) {
            cdb += cd - (cdb % cd) - 1;
        }
        c_d_can = (cdb - cda+1) / cd;

        System.err.println(ca);
        System.err.println(cb);
        System.err.println(c_can);
        System.err.println(da);
        System.err.println(db);
        System.err.println(d_can);
        System.err.println(cda);
        System.err.println(cdb);
        System.err.println(c_d_can);
        System.out.println(b-a+1-c_can-d_can+c_d_can);
    }
}
