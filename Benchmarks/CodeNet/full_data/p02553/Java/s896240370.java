
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long a = Integer.parseInt(scan.next());
        long b = Integer.parseInt(scan.next());
        long c = Integer.parseInt(scan.next());
        long d = Integer.parseInt(scan.next());
        scan.close();

        long max = a * c;
        max = Math.max(max, a * d);
        max = Math.max(max, b * c);
        max = Math.max(max, b * d);

        System.out.println(max);
    }
}
