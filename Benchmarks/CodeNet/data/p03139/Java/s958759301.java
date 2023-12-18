import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long a = sc.nextLong();
        long b = sc.nextLong();

        sc.close();

        long max = Math.min(a, b);
        long min = Math.max(a + b - n, 0);

        System.out.println(max + " " + min);
    }
}