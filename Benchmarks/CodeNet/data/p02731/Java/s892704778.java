import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final int L = sc.nextInt();

        final int d = L / 3;

        System.out.println(d * d * (d + L % 3));
    }
}
