import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        String op = in.next();
        int b = in.nextInt();

        while (op != null && !op.equals("?")) {
            switch (op) {
                case "+":
                    System.out.println(a + b);
                    break;
                case "-":
                    System.out.println(a - b);
                    break;
                case "*":
                    System.out.println(a * b);
                    break;
                default:
                    System.out.println(a / b);
                    break;
            }

            a = in.nextInt();
            op = in.next();
            b = in.nextInt();
        }

        System.exit(0);
    }
}

