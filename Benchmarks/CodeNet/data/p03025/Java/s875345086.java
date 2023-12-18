import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int x = Math.max(a, b);
        int y = 100 - x;

        double ansA = 1 / (a / 100.0);
        double ansB = 1 / (b / 100.0);

        if (ansA == ansB) {
            ansA /= 2;
        }

        System.out.println((int) ansA);
    }
}