import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int sum = 0;
        if (a + b < 2 * c) {
            sum = (a * x) + (b * y);
        } else {
            if (x < y) {
                // xは全て買い終える。
                sum = (2 * x * c);
                if (b < 2 * c) {
                    sum += (y - x) * b;
                } else {
                    sum += (y - x) * 2 * c;
                }
            } else {
                sum = (2 * y * c);
                if (a < 2 * c) {
                    sum += (x - y) * a;
                } else {
                    sum += (x - y) * 2 * c;
                }
            }
        }
        System.out.println(sum);
    }
}