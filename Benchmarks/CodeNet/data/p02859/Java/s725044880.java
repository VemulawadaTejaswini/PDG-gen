import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r = Integer.parseInt(scanner.next());
        scanner.close();

        double one = (1 * 1 * Math.PI);
        double x = (r * r * Math.PI);
        System.out.println((int) (x / one));
    }
}
