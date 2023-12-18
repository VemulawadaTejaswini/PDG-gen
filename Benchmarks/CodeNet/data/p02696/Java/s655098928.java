import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        long b = scan.nextLong();
        long n = scan.nextLong();
        long x = n;
        System.out.println((a * x / b) - a * (x / b));
    }
}