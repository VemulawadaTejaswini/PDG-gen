import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long A = Long.parseLong(scanner.next());
        float B = Float.parseFloat(scanner.next());
        scanner.close();

        long bb = (long) (B * 100f);

        System.out.println(A / 100 * bb);
    }
}
