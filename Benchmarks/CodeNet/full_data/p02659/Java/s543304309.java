
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final long A = sc.nextLong();
        final float B = sc.nextFloat();
        long b = (long) ((B+0.0001f) * 100 / 1);
        System.out.println(A * b / 100);
    }
}
