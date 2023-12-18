import java.util.*;
 
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long ans = Long.MAX_VALUE;
        for (long i = 1; i*i <= N; i++) {
            if (N%i == 0) {
                long a = i;
                long b = N/i;
                ans = Math.min(ans, a+b-2);
            }
        }
        System.out.println(ans);
    }
}
