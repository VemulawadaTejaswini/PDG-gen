

import java.util.Scanner;

public class Main {

    public static void main(final String[] args) {
        try (final Scanner sc = new Scanner(System.in)) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            if ((A < C && C < B) || (B < C && C < A)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }

}
