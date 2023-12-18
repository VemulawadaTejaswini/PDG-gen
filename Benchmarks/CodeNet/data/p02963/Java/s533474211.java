import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        long s = scanner.nextLong();
        if (s % 2 == 0) {
            System.out.printf("0 0 0 %d 2 %d\n", s / 2, s / 2);
        } else {
            System.out.printf("0 0 %d 1 2 1", (s + 1) / 2);
        }
    }
}