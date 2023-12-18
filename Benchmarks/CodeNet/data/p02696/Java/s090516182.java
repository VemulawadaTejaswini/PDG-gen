import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        long b = sc.nextLong();
        long n = sc.nextLong();
        System.out.println(function(a,b,Math.min(n,b-1)));
    }
    static long function(long a, long b, long x){
        return (long)(Math.floor(a*x/(double)b)-a*Math.floor(x/(double)b));
    }

}
