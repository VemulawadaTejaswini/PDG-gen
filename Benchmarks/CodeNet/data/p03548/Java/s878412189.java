import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int X = in.nextInt();
            int Y = in.nextInt();
            int Z = in.nextInt();

            X -= Z;

            System.out.println(X / (Y + Z));
        }
    }
}
