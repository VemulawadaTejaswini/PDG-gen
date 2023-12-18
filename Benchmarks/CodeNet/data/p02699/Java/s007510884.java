import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final int S = sc.nextInt();
        final int W = sc.nextInt();
        if (W >= S) {
            System.out.println("unsafe");
        } else {
            System.out.println("safe");
        }
    }
}
