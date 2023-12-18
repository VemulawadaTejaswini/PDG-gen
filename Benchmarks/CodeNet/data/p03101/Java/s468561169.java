import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        q_1();
    }

    private static void q_1() {
        try(Scanner scan = new Scanner(System.in)) {
            int H = scan.nextInt();
            int W = scan.nextInt();
            int h = scan.nextInt();
            int w = scan.nextInt();

            int result = (H * W) - ((W * h) - (h * w) + (H * w));

            System.out.println(result);
        }
    }
}