import java.util.Scanner;

public class Main {
    static long max = (long) Math.pow(10, 9);

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            for (long i = 0L; i < max; i++) {
                if (Math.abs(a - i) == Math.abs(b - i)) {
                    System.out.println(i);
                    return;
                }
            }
            System.out.println("IMPOSSIBLE");
        }
    }
}
