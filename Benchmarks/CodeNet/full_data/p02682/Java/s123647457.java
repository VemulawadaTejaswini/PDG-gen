import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        int a, b, c, k;

        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        k = scanner.nextInt();

        if(k <= a) {
            System.out.println(k);
        }
        else if(k <= a+b) {
            System.out.println(k-b);
        }
        else if (k <= a+b+c) {
            System.out.println(a-(k-(a+b)));
        }
    }
}