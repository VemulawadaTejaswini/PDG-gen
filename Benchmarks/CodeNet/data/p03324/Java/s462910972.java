import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int n = sc.nextInt();

        long pow = Math.round(Math.pow(100, d));
        if (n <= 99) System.out.println(n * pow);
        else System.out.println(101 * pow);
    }
}