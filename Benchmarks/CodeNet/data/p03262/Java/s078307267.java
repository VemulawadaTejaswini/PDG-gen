import java.util.Arrays;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int X = sc.nextInt();
        int[] x = new int[n+1];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
        }
        x[n] = X;
        Arrays.sort(x);
        long gcd = x[1] - x[0];
        for (int i = 0; i < n; i++) {
            gcd = gcd(gcd, x[i+1] - x[i]);
        }

        System.out.println(gcd);

    }

    private static long gcd(long a, long b) {
        long r;
        while( (r = a % b) != 0 ) {
            a = b;
            b = r;
        }
        return b;
    }
}
