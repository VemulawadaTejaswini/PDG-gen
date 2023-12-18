import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            long x = in.nextLong();
            long a = x / 11;
            long b = x % 11;
            System.out.println(2 * a + (b == 0 ? 0 : b <= 6 ? 1 : 2));
        }
    }
}
