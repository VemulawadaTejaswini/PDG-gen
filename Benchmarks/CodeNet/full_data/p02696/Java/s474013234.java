
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static long a = sc.nextLong();
    static long b = sc.nextLong();
    static long n = sc.nextLong();
    static long result = 0;
    public static void main(String[] args) { 
        long k = Math.min(n, b - 1);
        result = a * k / b - a * (k / b);
        System.out.println(result);
    }

}
