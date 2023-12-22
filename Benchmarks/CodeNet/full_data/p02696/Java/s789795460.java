import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long b = sc.nextLong();
        long n = sc.nextLong();

        long ans = Long.MIN_VALUE;

        for(long i = n; i <= n; i++){
            long j = (long)((double)a * i / b);
            long k = (long)((double)i / b);
            long l = j - a * k;
            ans = Math.max(ans, l);
        }

        System.out.println(ans);

    }
}
