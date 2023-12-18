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

        int n = scan.nextInt();
        int smallestValue = Integer.MAX_VALUE;
        int smallestPosition = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            int rank = scan.nextInt();
            int value = scan.nextInt();
            if (smallestValue > value) {
                smallestValue = value;
                smallestPosition = rank;
            }
        }
        System.out.println(smallestPosition + smallestValue);


        finish();
    }
}
