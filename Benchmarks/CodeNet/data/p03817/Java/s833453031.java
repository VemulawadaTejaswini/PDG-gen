import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long a = x / 11;
        a *= 2;
        int b = (int) x % 11;
        if (b > 6) {
            a += 2;
        } else if (b > 0) {
            a += 1;
        }
        System.out.println(a);
    }

}
