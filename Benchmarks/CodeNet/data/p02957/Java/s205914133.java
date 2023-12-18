import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt();
        long b = sc.nextInt();
        if (a % 2 == 0 && b % 2 == 0
                || a % 2 == 1 && b % 2 == 1) {
            System.out.println((a + b) / 2);
            return;
        }
        System.out.println("IMPOSSIBLE");
    }

}
