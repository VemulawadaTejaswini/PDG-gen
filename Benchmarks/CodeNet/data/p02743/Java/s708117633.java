import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        long c = scanner.nextLong();
        if (a * a + b * b > c * c) {
            System.out.println("Yes");
        } else  {
            System.out.println("No");
        }
    }
}