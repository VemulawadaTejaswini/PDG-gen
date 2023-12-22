import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        // double b = sc.nextDouble();
        String b = sc.next();

        // long ans = (long)(a*b);

        long b0 = b.charAt(0) - '0';
        long b1 = b.charAt(2) - '0';
        long b2 = b.charAt(3) - '0';

        long ans = a * b0 + a * b1 / 10 + a * b2 / 100;
        System.out.println(ans);
    }
}