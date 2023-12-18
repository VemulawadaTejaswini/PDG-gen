import java.util.*;

public class Main {
    public static void main(String[] args) {
        try (final Scanner sc = new Scanner(System.in)) {
            final double value = sc.nextDouble();
            if (value % 2 == 0) {
                System.out.println(0.5000000000);
                return;
            }
            System.out.println((((value - 1) / 2) + 1) / value);
            return;
        }
    }
}