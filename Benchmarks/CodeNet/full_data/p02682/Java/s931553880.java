import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        long b = in.nextLong();
        long c = in.nextLong();
        long k = in.nextLong();

        if (k <= a + b) {
            System.out.println(a);
        } else {
            System.out.println(a - (k - (a + b)));
        }
    }
}