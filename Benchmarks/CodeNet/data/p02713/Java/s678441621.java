import java.util.*;

public class Main {
    public static long gcd(long a, long b){
        long x;
        long y;
        if(b > a){
            x = b;
            y = a;
        }else{
            x = a;
            y = b;
        }
        long lm;
        while((lm = x%y) != 0){
            x = y;
            y = lm;
        }
        return y;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long sum = 0;
        for(long a = 1; a <= N; a++){
            for(long b = 1; b <= N; b++){
                for(long c = 1; c <= N; c++){
                    sum = sum + gcd(a, gcd(b, c));
                }
            }
        }
        System.out.println(sum);
    }
} 