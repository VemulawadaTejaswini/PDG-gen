import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final long A = sc.nextLong();
        final long V = sc.nextLong();
        final long B = sc.nextLong();
        final long W = sc.nextLong();
        final long T = sc.nextLong();

        if (A+V*T >= B+W*T && (A+V) % 2 != (B+W) % 2) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
