
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long a = sc.nextLong();
        long b = sc.nextLong();

        long count = 0;

        if (a == 0) {
            System.out.println("0");
            return;
        }
        long no = 0;

        while (true) {
            if (n <= no + a) {
                count += n - no;
                break;
            }
            if (n <= b + no) {
                count = a;
                break;
            } else {
                no = a + b;
                count = a;
            }
        }
        System.out.println(count);
    }
}