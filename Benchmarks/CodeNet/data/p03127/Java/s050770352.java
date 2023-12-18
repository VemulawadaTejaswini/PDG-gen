import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextLong();
        }
        long ans = a[0];
        for (int i = 1; i < a.length; i++) {
            ans = gcd(ans, a[i]);
        }
        System.out.println(ans);
    }

    public static final long gcd(long a, long b) {
        if( b == 0 ) return a;
        return gcd(b, a % b);
    }
}