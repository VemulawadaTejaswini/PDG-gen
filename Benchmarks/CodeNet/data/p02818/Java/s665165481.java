import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        long b = in.nextLong();
        long k = in.nextLong();

        b = Math.max(b - (k - a), 0);
        a = Math.max(a - k, 0);
        System.out.println(a + " " + b);
    }
}
