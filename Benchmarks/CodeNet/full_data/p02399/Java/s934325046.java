
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static int a = sc.nextInt();
    static int b = sc.nextInt();

    public static void main(String[] args) {
        int d = a / b;
        int r = a % b;
        double f = (double)a / (double) b;
        System.out.print(d + " " + r + " ");
        System.out.printf("%f\n", f);

    }
}

