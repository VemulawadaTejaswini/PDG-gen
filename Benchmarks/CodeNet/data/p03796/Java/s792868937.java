import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = Long.parseLong(sc.next());
        System.out.println(factorial(n));
    }
    
    private static long factorial(long n) {
        final long MOD = (long) (Math.pow(10, 9) + 7);
        long ans = 1;
        long temp = n;
        while (temp > 1) {
            ans = temp * ans % MOD;
            temp--;
        }
        return ans;
    }
}