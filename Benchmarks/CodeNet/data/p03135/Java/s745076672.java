import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int T = in.nextInt();
            int X = in.nextInt();
            System.out.println((double) T / X);
        }
    }
}
