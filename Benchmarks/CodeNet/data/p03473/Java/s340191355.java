import java.util.Scanner;

public class Main {

    private static Scanner scan;

    private static void start() {
        scan = new Scanner(java.lang.System.in);
    }

    private static void finish() {
    }

    public static void main(String[] args) {
        start();

        int m = scan.nextInt();
        System.out.println(48 - m);

        finish();
    }
}
