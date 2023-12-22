import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        LOOP: while (scan.hasNext()) {
            int a     = scan.nextInt();
            String op = scan.next();
            int b     = scan.nextInt();

            int n = 0;
            switch (op) {
            case "+": n = a + b; break;
            case "-": n = a - b; break;
            case "*": n = a * b; break;
            case "/": n = a / b; break;
            default : break LOOP;
            }
            System.out.println(n);
        }
    }
}