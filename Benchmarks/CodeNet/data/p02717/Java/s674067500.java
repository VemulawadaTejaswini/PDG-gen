import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        int X = scanner.nextInt();
        int Y = scanner.nextInt();
        int Z = scanner.nextInt();
        int N;

        N = X;
        X = Y;
        Y = N;

        N = X;
        X = Z;
        Z = N;

        System.out.println(X + " " + Y + " " + Z);
    }
}