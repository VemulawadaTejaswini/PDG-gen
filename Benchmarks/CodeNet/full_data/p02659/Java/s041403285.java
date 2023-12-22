import java.util.Locale;
import java.util.Scanner;

public class Main {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        in.useLocale(new Locale("Locale.US"));
        long a = in.nextLong();
        double b = in.nextDouble();
        System.out.println((long) Math.floor(a * b));
    }
}
