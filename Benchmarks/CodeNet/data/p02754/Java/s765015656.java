import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long a = sc.nextLong();
        long b = sc.nextLong();

        long both = n / (a + b);
        long mod = n % (a + b);
        long ans = a * both + Math.min(mod, a);
        System.out.println(ans);
    }
}
