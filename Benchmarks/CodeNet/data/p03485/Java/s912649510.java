import java.util.Scanner;

public class Main {
    static int A;
    static int B;
    static int[] a;

    private static void init() {
        Scanner scanner = new Scanner(System.in);
        A = scanner.nextInt();
        B = scanner.nextInt();
        scanner.close();
    }


    public static void main(String args[]) {
        init();
        System.out.println((A + B + 1) / 2);
    }
}