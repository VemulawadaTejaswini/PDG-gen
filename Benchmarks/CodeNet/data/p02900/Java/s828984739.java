import java.util.Scanner;

public class Main {

    static long gcd(long a, long b) {
        if (a > b) return gcd(b, a);
        if (a == 0) return b;
        return gcd(b % a, a);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long A = sc.nextLong();
        long B = sc.nextLong();
        long d = gcd(A, B);
        long limit = (long) Math.ceil(Math.sqrt(d));
        int sol = 1;

        for (int i = 2; i <= limit; i++) {
            if (d % i != 0) continue;
            sol++;
            while (d % i == 0) d /= i;
        }
  
        if (sol == 1) sol = d == 1 ? 1 : 2;

        System.out.println(sol);
    }
}