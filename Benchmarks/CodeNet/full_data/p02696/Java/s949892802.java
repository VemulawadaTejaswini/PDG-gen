
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long a = Long.parseLong(scan.next());
        long b = Long.parseLong(scan.next());
        long n = Long.parseLong(scan.next());
        scan.close();

        long ans = 0;
        if (n < b) {
            ans = a * n;
            ans /= b;
        } else {
            ans = a * (b - 1);
            ans /= b;
        }

        System.out.println(ans);
    }
}
