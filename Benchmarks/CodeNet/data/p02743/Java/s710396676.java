
import java.util.Scanner;

public class Main {
    private static boolean check(long a, long b, long c) {
        if (c - a - b < 0) {
            return false;
        }
        return (c - a - b) * (c - a - b) > 4 * a * b;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a = in.nextInt();
        long b = in.nextInt();
        long c = in.nextInt();

        System.out.println(check(a,b,c) ? "Yes" : "No");
    }
}
