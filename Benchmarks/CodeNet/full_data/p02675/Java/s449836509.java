import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer number = scanner.nextInt();

        if (number >= 10) {
            number = number % 10;
        }

        if (number == 2 | number == 4 | number == 5 | number == 7 | number == 9) {
            System.out.println("hon");
        } else if (number == 0 | number == 1 | number == 6 | number ==8) {
            System.out.println("pon");
        } else {
            System.out.println("bon");
        }
    }
}
