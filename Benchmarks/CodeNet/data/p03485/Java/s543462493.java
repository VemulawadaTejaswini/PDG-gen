import java.util.Scanner;

public class Main {
    static double a;
    static double b;

    private static void init() {
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();

        scanner.close();
    }


    public static void main(String args[]) {
        init();

        int ans =(int) Math.ceil((a + b) / 2);
        System.out.println(ans);
    }
}
