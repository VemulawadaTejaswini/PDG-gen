import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int A = in.nextInt();
            int P = in.nextInt();
            System.out.println((A * 3 + P) / 2);
        }
    }
}
