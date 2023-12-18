import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(a <= 5 ? 0 : a <= 12 ? b / 2 : b);
    }
}