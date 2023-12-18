import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = Integer.parseInt(scanner.next());
        int B = Integer.parseInt(scanner.next());

        scanner.close();

        int sum = A + B;
        if (sum >= 10) {
            System.out.println("error");
        } else {
            System.out.println(sum);
        }
    }
}
