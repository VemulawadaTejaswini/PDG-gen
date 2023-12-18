
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a = n / 100;
        int b = (n - a * 100) / 10;
        int c = (n - a * 100 - b * 10);

        if (a <= b) {
            if (b <= c) {
                System.out.println(c * 100 + c * 10 + c);
            } else {
                System.out.println(b * 100 + b * 10 + b);
            }
        } else {
            System.out.println(a * 100 + a * 10 + a);
        }
    }
}






