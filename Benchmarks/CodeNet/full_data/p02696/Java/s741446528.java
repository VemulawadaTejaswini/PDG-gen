import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long n = sc.nextLong();
        long x = Math.min(n, b - 1);
        System.out.println((long) (Math.floor(a * x / b) - a * Math.floor(x / b)));
    }

}