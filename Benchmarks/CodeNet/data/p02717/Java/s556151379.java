import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int X = sc.nextInt();
            int Y = sc.nextInt();
            int Z = sc.nextInt();

            int swap = X;
            X = Y;
            Y = swap;
            swap = X;
            X = Z;
            Z = swap;

            System.out.println(X + " " + Y + " " + Z);
        }
    }
}
