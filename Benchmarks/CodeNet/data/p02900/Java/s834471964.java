import java.util.*;
public class Main { 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();

        long gcd = gcd(a, b);
        System.out.println(factorize(gcd) + 1);
    }

    private static int factorize(long num) {
        int cnt = 0;
        for(long i = 2; i * i <= num; i++) {
            if(num % i != 0)
                continue;
            cnt++;
            while(num % i == 0) {
                num /= i;
            }
        }
        if(num != 1)
            cnt++;
        return cnt;
    }
    private static long gcd(long a, long b) {
        if(b == 0)
            return a;
        return gcd(b, a % b);
    }

}