import java.util.Scanner;

/**
 * Distance
 */
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int x1 = scan.nextInt();
        int y1 = scan.nextInt();
        int x2 = scan.nextInt();
        int y2 = scan.nextInt();

        double sum = Math.sqrt((y2-y1) + (x2-x1));
        System.out.println(String.format("%.6f", sum));
    }
}