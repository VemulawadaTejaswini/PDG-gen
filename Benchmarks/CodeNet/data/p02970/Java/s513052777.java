import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final int N = sc.nextInt();
        final int D = sc.nextInt();

        System.out.println((int)Math.ceil(N / (D * 2 + 1.0)));
    }
}
