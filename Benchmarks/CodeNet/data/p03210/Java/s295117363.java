

import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        final Scanner scanner = new Scanner(System.in);
        final int age = scanner.nextInt();
        if (age == 7 || age == 5 || age == 3) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
