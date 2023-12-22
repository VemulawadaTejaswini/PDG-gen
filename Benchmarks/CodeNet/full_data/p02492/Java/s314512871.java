import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            int a     = scan.nextInt();
            String op = scan.next();
            int b     = scan.nextInt();
            if (op.equals("?"))
                break;

            int result = calculate(op, a, b);
            System.out.println(result);
        }
    }

    public static int calculate(String op, int a, int b) {
        switch (op) {
        case "+": return a + b;
        case "-": return a - b;
        case "*": return a * b;
        case "/": return a / b;
        default: return 0;
        }
    }
}