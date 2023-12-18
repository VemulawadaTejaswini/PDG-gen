import java.util.Scanner;

/**
 * @author nakker
 */

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String color = scanner.next();
        if (number < 3200) {
            color = "red";
        }
        System.out.println(color);
    }
}
