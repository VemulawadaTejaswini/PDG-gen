import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final int A = scan.nextInt();
        final int B = scan.nextInt();
        scan.close();

        if ((A + B) % 2 == 0) {
            System.out.println((A + B) / 2);
        } else {
            System.out.println("IMPOSSIBLE");
        }
    }
}