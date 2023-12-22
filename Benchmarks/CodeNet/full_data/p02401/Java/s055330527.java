import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c;
        String op;
        while (true) {
            a = scanner.nextInt();
            op = scanner.next();
            b = scanner.nextInt();
            if (op.equals("?")) {
                break;
            }
            switch (op) {
                case "+":
                    c = a + b;
                    System.out.println(c);
                    break;
                case "-":
                    c = a - b;
                    System.out.println(c);
                    break;
                case "*":
                    c = a * b;
                    System.out.println(c);
                    break;
                case "/":
                    c = a / b;
                    System.out.println(c);
                    break;
                default:
                    break;
            }

        }

    }
}