
import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int degree = (n - 2) * 180;
        System.out.print(degree);
    }
}
