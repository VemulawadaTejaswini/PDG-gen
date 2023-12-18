import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (b < 0) {
            int count = - a + b + 1;
            if (count % 2 == 0) {
                System.out.println("Positive");
            } else {
                System.out.println("Negative");
            }
        } else if (a > 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Zero");
        }
    }
}