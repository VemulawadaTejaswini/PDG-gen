
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long a = sc.nextLong();
        long b = sc.nextLong();

        long sho = n / (a + b);
        long amari = n % (a + b);

        long pulus = 0;
        if (amari <= a) {
            pulus = amari;
        } else {
            pulus = a;
        }

        System.out.println(sho * a + pulus);

    }
}