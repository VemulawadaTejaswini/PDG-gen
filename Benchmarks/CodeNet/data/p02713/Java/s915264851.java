
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();

        long sum = 0;
        for (int a=1; a<=K; a++) {

            for (int b=1; b<=K; b++) {

                for (int c=1; c<=K; c++) {
                    int gcd = gcd(a, b, c);
                    sum += gcd;
                }
            }
        }
        System.out.println(sum);
    }

    private static int gcd(int a, int b, int c) {
        int gcd = gcd(a, b);
        int gcd1 = gcd(a, c);
        return gcd(gcd, gcd1);
    }

    private static int gcd (int a, int b) {return b>0 ? gcd(b,a%b): a;}
}
