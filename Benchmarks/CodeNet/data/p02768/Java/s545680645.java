import java.util.*;
import java.lang.Math;

public class Main{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        long count = 1;
        long div = 1000000007;

        count = modPow(2,n,div);
        System.out.println(count % div);

        long ax = 1;
        for(int i=1; i<=a; i++){
            ax = (ax * (n-i+1)) % div;
        }
        long ay = 1;
        for(int i=1; i<=a; i++){
            ay = (ay * i) % div;
        }
        long ayinv = modPow(ay, div-2, div);

        long bx = 1;
        for(int i=1; i<=b; i++){
            bx = (bx * (n-i+1)) % div;
        }
        long by = 1;
        for(int i=1; i<=b; i++){
            by = (by * i) % div;
        }
        long byinv = modPow(by, div-2, div);

        System.out.println(mod(count - ((ax*ayinv)%div) - ((bx*byinv)%div) -1, div));
    }
    public static long mod(long a, long p){
        long val = a % p;
        if(val >= 0){
            return val;
        }else{
            return val + p;
        }
    }
    public static long modPow(long a, long n, long p){
        if(n==1){
            return a % p;
        }else if (n%2==0){
            long t = modPow(a, n/2, p);
            return (t*t) % p;
        }else{
            return (modPow(a, n-1, p) * a) % p;
        }
    }
}