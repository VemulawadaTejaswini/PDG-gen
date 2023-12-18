import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int D = in.nextInt();
            System.out.print("Christmas");
            for (int i = D; i < 25; i++) {
                System.out.print(" Eve");
            }
            System.out.println();
        }
    }
}
