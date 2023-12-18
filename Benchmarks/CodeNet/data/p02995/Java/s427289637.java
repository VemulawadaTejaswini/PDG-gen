import java.util.*;
public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        long A = sc.nextInt();
        long B =sc.nextInt();
        long C =sc.nextInt();
        long D =sc.nextInt();
        long num1,num2,num3,num4,num5,num6,opt;
        long cd = C*D/gcd(C,D);
        num1 = B/C;
        num2 = B/D;
        num3 = B/cd;
        num4 = (A-1)/C;
        num5 = (A-1)/D;
        num6 = (A-1)/cd;
        opt = (B-A+1)-(num1+num2-num3-(num4+num5-num6));
        System.out.println(num1+" "+num2+" "+num3+" "+num4+" "+num5+" "+num6);
        System.out.println(opt);
    }
    private static long gcd(long m, long n) {
        if(m < n) return gcd(n, m);
        if(n == 0) return m;
        return gcd(n, m % n);
    }
}
