
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1 ; i <= 5 ; i++) {
            int x = scanner.nextInt();
            if (x == 0) {
                System.out.println(i);
                return;
            }
        }
    }
}
