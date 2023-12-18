import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int n = scanner.nextInt();
        int m = n, s = 0;
        while (m != 0) {
            s += m % 10;
            m /= 10;
        }
        System.out.println(n % s == 0 ? "Yes" : "No");
    }
}