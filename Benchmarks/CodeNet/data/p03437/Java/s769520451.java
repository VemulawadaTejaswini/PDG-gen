import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt();
        long b = sc.nextInt();
        sc.close();

        if (a == b) {
            System.out.println("-1");
            return;
        }

        for (int i = 2; i < 1000000000; i++) {
            if (a * i % b != 0) {
                System.out.println(a * i);
                return;
            }
        }
        System.out.println("-1");
    }
}