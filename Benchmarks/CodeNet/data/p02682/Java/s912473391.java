import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int k = scan.nextInt();

        long sum = 0;
        for (; a != 0 && k != 0; a--, k-- ) {
            sum += 1;
        }

        k -= b;

        for (; c != 0 && k > 0; c--, k--) {
            sum -= 1;
        }

        System.out.println(sum);
    }
}