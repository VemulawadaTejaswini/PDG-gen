import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            int D = sc.nextInt();

            for (;;) {
                C -= B;
                if (C <= 0) {
                    System.out.println("Yes");
                    return;
                }
                A -= D;
                if (A <= 0) {
                    System.out.println("No");
                    return;
                }
            }
        }
    }
}
