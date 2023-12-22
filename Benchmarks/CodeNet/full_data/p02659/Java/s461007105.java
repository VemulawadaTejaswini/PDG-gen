
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final long A = sc.nextLong();
        final float B = sc.nextFloat();
        int b = (int) (B * 100);
        int b_x = b / 100, b_y = b % 100;
        long a_x = A * b_x;
        long a_y = A * b_y / 100;
        System.out.println(a_x + a_y);
    }
}
