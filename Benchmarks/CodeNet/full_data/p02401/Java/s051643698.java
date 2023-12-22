import java.util.Scanner;

public class Main {
    private static Scanner scan;

    public static void main(String[] args) {
        scan = new Scanner(System.in);
        while (true) {
            int a = scan.nextInt();
            String op = scan.next();
            int b = scan.nextInt();
            if (op.equals("+")) {
                sum(a + b);
            } else if (op.equals("-")) {
                sum(a - b);
            } else if (op.equals("*")) {
                sum(a * b);
            } else if (op.equals("/")) {
                sum(a / b);
            } else {
                return;
            }
        }
    }

    private static void sum(int sum) {
        System.out.println(sum);
    }
}