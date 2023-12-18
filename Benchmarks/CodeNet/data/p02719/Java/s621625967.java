import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long N = s.nextLong(),K = s.nextLong();
        System.out.println(GCD(N, K));
    }
    private static long GCD(long a, long b) {
        long val = a%b;
        return Math.min(val, b-val);
    }
}