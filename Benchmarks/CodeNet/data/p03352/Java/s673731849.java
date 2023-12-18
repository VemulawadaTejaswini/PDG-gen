import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int x = scanner.nextInt();
        int max = 0;
        for (int i = 1; i <= x; i++) {
            if (i * i <= x) {
                max = i;
            }
        }
        System.out.println(max * max);
    }
}