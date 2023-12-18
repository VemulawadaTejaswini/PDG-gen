import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long input = scanner.nextInt();
        scanner.close();

        long ans = 0l;
        for (long i = 1l; i <= input; i++) {
            if (i % 3 != 0 && i % 5 != 0) {
                ans += i;
            }
        }

        System.out.println(ans);

    }
}
