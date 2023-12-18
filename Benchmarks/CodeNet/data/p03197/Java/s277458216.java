

import java.util.Scanner;

public class Main {

    public static void main(String [] args) {
        final Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        boolean win = false;
        for (int i = 0; i < N; ++i) {
            int num = scanner.nextInt();
            if (num % 2 == 1) {
                win = true;
            }
        }
        if (win) {
            System.out.println("first");
        } else {
            System.out.println("second");
        }
    }
}
