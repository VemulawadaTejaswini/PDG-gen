
import java.util.Scanner;

public class Main {

    //Main
    public static void main(String args[]) throws Exception {

        Scanner Input = new Scanner(System.in);

        int X = Input.nextInt();
        int Y = Input.nextInt();

        if (X == Y) {
            System.out.println("Draw");
        } else if (X == 1) {
            System.out.println("Alice");
        } else if (Y == 1) {
            System.out.println("Bob");
        } else if (X > Y) {
            System.out.println("Alice");
        } else if (Y > X) {
            System.out.println("Bob");
        }

    }
}
