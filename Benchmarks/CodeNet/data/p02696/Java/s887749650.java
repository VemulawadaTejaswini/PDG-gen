import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long n = sc.nextLong();

        System.out.println(func(a, b, Math.min(b -1, n)));
    }
    static long func(long a, long b, long n){
        return ((a * n) / b) - (a * (n / b));
    }
}