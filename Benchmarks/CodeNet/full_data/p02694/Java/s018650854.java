import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            long X = sc.nextLong();
            long x = 100;
            for (int i = 0;; i++) {
                if (x >= X) {
                    System.out.println(i);
                    return;
                }

                x += x / 100;
            }
        }
    }
}
