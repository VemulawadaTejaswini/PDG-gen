import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        if (a==1||b==1)System.out.println(1);
        else System.out.println(function(gcd(Math.max(a,b),Math.min(a,b))));

    }
    static long gcd(long x,long y){
        if (y==0)return x;
        else return gcd(y,x%y);
    }
    static long function(long num){
        long n = num;
        long count = 2;
        long ans = 0;
        long lim = (long)Math.ceil(Math.sqrt(num))+1000;
        while (n>1&&count<=lim){
            if (n%count==0)ans++;
            while (n%count==0){
                n/=count;
            }
            count++;
        }
        if (count>lim)ans++;
        return ++ans;
    }
}
