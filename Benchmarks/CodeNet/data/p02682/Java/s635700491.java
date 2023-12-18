import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextInt();
        long b = scanner.nextInt();
        long c = scanner.nextInt();
        long k = scanner.nextInt();
        if (a + b >= k) {
            System.out.println(a);
        }else {
            System.out.println(a - (k - (a + b)));
        }
    }
}
