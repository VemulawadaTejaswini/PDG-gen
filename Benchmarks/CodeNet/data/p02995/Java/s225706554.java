import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();
        long cdDt = b/lcm(c,d);
        long cDt = b/c;
        long dDt = b/d;
        long ansT = b-cDt-dDt+cdDt;
        long cdDa = (a-1)/lcm(c,d);
        long cDa = (a-1)/c;
        long dDa = (a-1)/d;
        long ansA = a-1-cDa-dDa+cdDa;
        System.out.println(ansT-ansA);
    }
    static long gcd(long x,long y){
        if (y==0)return x;
        else return gcd(y,x%y);
    }
    static long lcm(long x,long y){
        return x/gcd(x,y)*y;
    }
}
