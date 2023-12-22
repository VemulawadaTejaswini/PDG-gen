import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int sum = 0;
            if (a > b) {
                a = a % b;
            }
            a *= 10;
            for (int i = 0; i < c; i++) {
                sum += a / b;
                a = a % b;
                a *= 10;
            }
            System.out.println(sum);
        }
    }
}
