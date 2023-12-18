import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long p = scan.nextLong();
        long m = scan.nextLong();
        System.out.println(gcd(p,m));
    }

    private static long gcd(long p, long m) {
        if(m == 0) return p;
        return gcd(m,p%m);
    }
}
