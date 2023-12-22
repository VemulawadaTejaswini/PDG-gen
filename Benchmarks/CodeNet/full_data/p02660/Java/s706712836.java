import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        long n = scan.nextLong();
        long p = 2;
        long e = 1;
        long div = 0;

        int count = 0;
        while(n >= p) {
            div = (long)Math.pow(p, e);

            if (n % div == 0) {
                count++;
                n /= div;
                e++;
                continue;
            }
            p++;
            e = 1;
        }
        System.out.println(count);
    }
}