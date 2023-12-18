import java.util.Scanner;

public class Main {
    static long gcd(long ai, long aj) {
        if (aj == 0)
            return ai;
        else
            return gcd(aj, ai % aj);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long A = sc.nextLong();
        long B = sc.nextLong();
        long gcd = gcd(A, B);
        int count = 1;

        for (int i = 2; i <= Math.sqrt(gcd); i++) {
            if (gcd % i == 0) {
                count++;
            }
            while (gcd % i == 0) {
                gcd /= i;
            }
        }

        if(gcd >1)
            count++;

        System.out.println(count);

    }
}
