import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final double H = sc.nextInt();
        final double A = sc.nextInt();

        System.out.println((int)Math.ceil(H / A));
    }
}
