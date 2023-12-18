import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long q = sc.nextLong();
        long h = sc.nextLong();
        long s = sc.nextLong();
        long d = sc.nextLong();
        long n = sc.nextLong();
        long rem = n % 2;
        long min = n / 2 * d + Math.min(Math.min(rem * s, rem * 2 * h), rem * 4 * q);
        min = Math.min(min, n * s);
        min = Math.min(min, n * 2 * h);
        System.out.println(Math.min(min, n * 4 * q));
    }

}
