import java.util.Scanner;
 
/**
 * @author Lillard
 */
public class Main {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (b < 0) {
            if ((b-a+1)%2 == 1) {
                System.out.println("Negative");
            } else {
                System.out.println("Positive");
            }
        } else if (a > 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Zero");
        }
 
        System.exit(0);
    }
}