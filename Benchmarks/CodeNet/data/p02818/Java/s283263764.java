import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long k = sc.nextLong();

        long takahashi = (k - a) > 0 ? 0 : (a - k);
        long aoki = takahashi == 0 ? b - k + a : b;

        System.out.printf("%s %s", takahashi, aoki);
    }
}
