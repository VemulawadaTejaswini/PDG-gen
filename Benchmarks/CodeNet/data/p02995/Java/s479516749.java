import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long a = scan.nextLong();
        long b = scan.nextLong();
        int c = scan.nextInt();
        int d = scan.nextInt();
        long lcm = lcm(c, d);
        System.out.println(b - b / c - b / d + b / lcm - a + 1 + (a - 1) / c + (a - 1) / d - (a - 1) / lcm);
        scan.close();
    }
    static long gcd(long a, long b){
        return b > 0 ? gcd(b, a % b) : a;
    }
    static long lcm(long a, long b){
        return a * b / gcd(a, b);
    }
}
