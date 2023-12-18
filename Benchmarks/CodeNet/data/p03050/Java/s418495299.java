import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long ans = 0;
        for(long i = 1; i < n + 1; i++){
            long a = n / i;
            long b = n % i;
            if(a == b)
            ans = ans + i;
            //System.out.println(a + " " + b);
        }
        System.out.println(ans);
    }
}