import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r = Integer.parseInt(scanner.next());
        scanner.close();

        System.out.println((int)Math.pow(r, 2));
    }
}
