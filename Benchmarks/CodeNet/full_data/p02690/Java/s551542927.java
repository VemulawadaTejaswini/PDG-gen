import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long x = scanner.nextLong();

        for (long a = -118; a <= 119; a++) {
            for (long b = -119; b <= 118; b++) {
                if (((long)Math.pow(a, 5)) - ((long)Math.pow(b, 5)) == x) {
                    System.out.println(a + " " + b);
                    System.exit(0);
                }
            }
        }
    }
}