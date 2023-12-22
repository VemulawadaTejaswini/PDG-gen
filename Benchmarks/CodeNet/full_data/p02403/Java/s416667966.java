import java.util.Scanner;

public class Main {
    private static Scanner scan;

    public static void main(String[] args) {
        scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        for (int i = 0; i < x; i++) {
            for (int p = 0; p < y; p++) {
                System.out.print("#");
            }
            System.out.print("\n");
        }
        System.out.print("\n");
    }
}