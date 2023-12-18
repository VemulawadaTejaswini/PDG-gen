import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int length = a + b;
        int count = 0;
        if (length == 0 || a == 0) {
            System.out.println(0);
        } else {
            count += ((int) Math.floor(n / length)) * a;
            count += Math.min(n % length, a);
            System.out.println(count);

        }

    }
}
