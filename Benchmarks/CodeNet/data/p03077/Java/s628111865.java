import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong(), a = sc.nextLong(),
                b = sc.nextLong(), c = sc.nextLong(),
                d = sc.nextLong(), e = sc.nextLong();
        long min = Math.min(a, Math.min(b, Math.min(d, e)));
        long num = (long)Math.ceil((double)n / min) - 1;
        System.out.println(num + 5);
    }
}
