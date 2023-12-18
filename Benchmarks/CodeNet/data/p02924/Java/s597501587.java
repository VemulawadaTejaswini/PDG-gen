import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long N = Long.parseLong(scanner.next());
        scanner.close();

        System.out.println((N - 1) * N / 2);
    }
}
